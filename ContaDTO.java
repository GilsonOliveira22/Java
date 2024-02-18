import java.math.BigDecimal;

public class ContaDTO {
    private BigDecimal saldo;
    private BigDecimal deposito;
    private BigDecimal saque;

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getDeposito() {
        return deposito;
    }

    public BigDecimal getSaque() {
        return saque;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setDeposito(BigDecimal deposito) {
        this.deposito = deposito;
    }

    public void setSaque(BigDecimal saque) {
        this.saque = saque;
    }


}
