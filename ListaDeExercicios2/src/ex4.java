
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BmnGamer
 */
public class ex4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite sua idade!");
        int idade = Integer.parseInt(input);
        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Você não pode votar!");
        } else if (idade >= 18 && idade <= 65) {
            JOptionPane.showMessageDialog(null, "Você é um eleitor obrigatório!");
        }
        else if((idade >= 16 && idade < 18) || idade > 65){
            JOptionPane.showMessageDialog(null, "Você é um eleitor facultativo!");
        }
    }
}
