import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaDTO contaDTO = ContaRecurso.saldoTotal(
                new BigDecimal(100),
                new BigDecimal(70),
                new BigDecimal(149));


        System.out.println("Saldo: " + contaDTO.getSaldo());
        System.out.println("valor depositado: " + contaDTO.getDeposito());
        System.out.println("valor sacado: " + contaDTO.getSaque());
    }


}