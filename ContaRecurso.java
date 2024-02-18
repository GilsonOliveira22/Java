import java.math.BigDecimal;

public class ContaRecurso {

    public static ContaDTO saldoTotal(BigDecimal saldo, BigDecimal deposito, BigDecimal saque) {
        ContaDTO contaDTO = new ContaDTO();
        BigDecimal saldoTotal = BigDecimal.ZERO;
        if (deposito.compareTo(BigDecimal.ZERO) != 0) {
            saldoTotal = ContaServico.deposito(deposito, saldo);
        }

        if (saque.compareTo(BigDecimal.ZERO) != 0) {
            if (saque.compareTo(saldoTotal) <= 0) {
                saldoTotal = ContaServico.sacar(saque, saldoTotal);
            } else
                throw new RuntimeException("Saldo insuficiente");
        }

        contaDTO.setSaldo(saldoTotal);
        contaDTO.setSaque(saque);
        contaDTO.setDeposito(deposito);

        return contaDTO;
    }


}
