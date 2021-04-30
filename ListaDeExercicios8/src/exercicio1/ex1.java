/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author BmnGamer
 */
public class ex1 {

    public static void main(String[] args) {
        Faturar f = new Faturar(123, "Bala", 100, 0.50);
        double total = f.getFaturarTotal();
        System.out.println(total);
    }

}
