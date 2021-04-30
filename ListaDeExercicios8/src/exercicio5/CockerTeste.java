/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
public class CockerTeste {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Qual o nome do Cachorro?");
        String raca = JOptionPane.showInputDialog(null, "Qual a raca do " + nome + "?");
        String tipo = JOptionPane.showInputDialog(null, "Qual o tipo do " + nome + "?");
        String cor = JOptionPane.showInputDialog(null, "Qual a cor do " + nome + "?");
        Cocker cocker = new Cocker(nome, raca, tipo, cor);
        cocker.setTosa(false);
        
        JOptionPane.showMessageDialog(null, cocker);
        JOptionPane.showMessageDialog(null, cocker.precisaTosa());
    }
}

