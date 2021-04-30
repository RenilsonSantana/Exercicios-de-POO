/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author BmnGamer
 */
public class ex2 {

    public static void main(String[] args) {
        Empregado funcionario1 = new Empregado("William", "Juliano", 10000.00);
        Empregado funcionario2 = new Empregado("Barbara", "Aparecida", 12000.00);

        System.out.println(funcionario1.getSalarioAnual());
        System.out.println(funcionario2.getSalarioAnual());

        funcionario1.aumento(10);
        funcionario2.aumento(10);

        System.out.println(funcionario1.getSalarioAnual());
        System.out.println(funcionario2.getSalarioAnual());
    }

}
