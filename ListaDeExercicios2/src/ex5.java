
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
public class ex5 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira um nome:");
        String input = JOptionPane.showInputDialog("Insira um número:");
        int idade = Integer.parseInt(input);
        if(idade <= 10 ){
            JOptionPane.showMessageDialog(null, nome + " terá que pagar R$30,00");
        } else if (idade > 10 && idade <= 29){
            JOptionPane.showMessageDialog(null, nome + " terá que pagar R$60,00");
        } else if (idade > 29 && idade <= 45){
            JOptionPane.showMessageDialog(null, nome + " terá que pagar R$120,00");
        } else if (idade > 45 && idade <= 59){
            JOptionPane.showMessageDialog(null, nome + " terá que pagar R$150,00");
        } else if (idade > 59 && idade <= 65){
            JOptionPane.showMessageDialog(null, nome + " terá que pagar R$250,00");
        } else {
            JOptionPane.showMessageDialog(null, nome + " terá que pagar R$400,00");
        }
    }
}
