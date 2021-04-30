/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
public class DataTeste {

    public static void main(String[] args) {
        try {
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês:"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano:"));

            Data data = new Data(dia, mes, ano);
            data.displayData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
