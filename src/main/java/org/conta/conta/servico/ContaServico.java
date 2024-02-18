package org.conta.conta.servico;

import org.conta.conta.dto.ContaDTO;

import java.math.BigDecimal;

public class ContaServico {

    public static ContaDTO consultarSaldo(BigDecimal saldo, BigDecimal deposito, BigDecimal saque) {
        ContaDTO contaDTO = new ContaDTO();
        BigDecimal saldoTotal = BigDecimal.ZERO;
        if (deposito.compareTo(BigDecimal.ZERO) != 0) {
            saldoTotal = deposito(deposito, saldo);
        }

        if (saque.compareTo(BigDecimal.ZERO) != 0) {
            if (saque.compareTo(saldoTotal) <= 0) {
                saldoTotal = sacar(saque, saldoTotal);
            } else
                throw new RuntimeException("Saldo insuficiente");
        }

        contaDTO.setSaldo(saldoTotal);
        contaDTO.setSaque(saque);
        contaDTO.setDeposito(deposito);

        return contaDTO;
    }

    private static BigDecimal sacar(BigDecimal valor, BigDecimal saldo) {
        return saldo.subtract(valor);
    }

    private static BigDecimal deposito(BigDecimal valor, BigDecimal saldo) {
        return saldo.add(valor);
    }

}
