
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
public class ex1 {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Insira um número:");
        int valorN = Integer.parseInt(valor);
        if(valorN % 3 == 0) {
          JOptionPane.showMessageDialog(null, valorN + " é divisivel por 3");
        } else {
          JOptionPane.showMessageDialog(null, valorN + " não divisivel por 3");
        }    
    }
}
