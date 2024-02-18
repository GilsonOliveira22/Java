package org.conta.conta;

import org.conta.conta.dto.ContaDTO;
import org.conta.conta.recurso.ContaRecurso;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaDTO contaDTO = ContaRecurso.consultarSaldo(
                new BigDecimal(100),
                new BigDecimal(50),
                new BigDecimal(25));


        System.out.println("Saldo: " + contaDTO.getSaldo());
        System.out.println("valor depositado: " + contaDTO.getDeposito());
        System.out.println("valor sacado: " + contaDTO.getSaque());
    }


}