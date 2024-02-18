package org.conta.conta.recurso;

import org.conta.conta.dto.ContaDTO;
import org.conta.conta.servico.ContaServico;

import java.math.BigDecimal;

public class ContaRecurso {

    public static ContaDTO consultarSaldo(BigDecimal saldo, BigDecimal deposito, BigDecimal saque) {
        return ContaServico.consultarSaldo(saldo, deposito, saque);
    }


}
