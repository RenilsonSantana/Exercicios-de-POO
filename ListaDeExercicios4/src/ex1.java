
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
    public static int DobraInteiro(int x){
        int r = x*2;
        return r;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor!"));
        int num2x = DobraInteiro(num);
        JOptionPane.showMessageDialog(null, "O dobro de " + num + " é igual a " + num2x);
    }
}
