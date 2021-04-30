
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
public class ex3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor do produto!");
        double valor = Double.parseDouble(input);
        if(valor < 20){
            valor *= 1.45;
            JOptionPane.showMessageDialog(null, "Para obter um lucro de 45% deve vender o produto a " + valor);
        }
        else{
            valor *= 1.30;
            JOptionPane.showMessageDialog(null, "Para obter um lucro de 30% deve vender o produto a " + valor);
        }
    }
}
