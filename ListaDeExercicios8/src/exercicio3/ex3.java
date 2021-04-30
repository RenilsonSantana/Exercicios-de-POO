/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
public class ex3 {

    public static void main(String[] args) {
        Calculadora soma = new Calculadora(10, 5, '+');
        Calculadora div = new Calculadora(10, 0, '/');
        Calculadora sub = new Calculadora(10, 3, '-');
        Calculadora mult = new Calculadora(5, 3, '*');

        try {
            soma.Calcular();
            div.Calcular();
            sub.Calcular();
            mult.Calcular();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        soma.MostrarValor();
        div.MostrarValor();
        sub.MostrarValor();
        mult.MostrarValor();
    }

}
