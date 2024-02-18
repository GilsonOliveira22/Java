import java.math.BigDecimal;

public class ContaServico {
    public static BigDecimal sacar(BigDecimal valor, BigDecimal saldo) {
        return saldo.subtract(valor);
    }
    public static BigDecimal deposito(BigDecimal valor, BigDecimal saldo){
        return saldo.add(valor);
    }

}
