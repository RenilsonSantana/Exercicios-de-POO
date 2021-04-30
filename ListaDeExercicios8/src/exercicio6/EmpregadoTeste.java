/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
public class EmpregadoTeste {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        double autura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        String sexo = JOptionPane.showInputDialog("Digite seu genero:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario:"));

        Empregado empregado = new Empregado(salario, nome, idade, autura, sexo);

        JOptionPane.showMessageDialog(null, "R$: " + empregado.obterLucro());
    }
}
