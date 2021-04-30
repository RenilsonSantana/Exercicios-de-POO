
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
public class ex2 {
    public static void main(String[] args) {
        int n1, n2, n3;
        String valor = JOptionPane.showInputDialog("Insira o primeiro número:");
        int valor1 = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Insira o segundo número:");
        int valor2 = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog("Insira o terceiro número:");
        int valor3 = Integer.parseInt(valor);

        if(valor1 < valor2 && valor1 < valor3) {
            n1 = valor1;
            if(valor2 < valor3){
                n2 = valor2;
                n3 = valor3;
            }
            else{
                n2 = valor3;
                n3 = valor2;
            }
        }
        else if(valor2 < valor1 && valor2 < valor3) {
            n1 = valor2;
            if(valor1 < valor3){
                n2 = valor1;
                n3 = valor3;
            }
            else{
                n2 = valor3;
                n3 = valor1;
            }
        }
        else{
            n1 = valor3;
            if(valor1 < valor2){
                n2 = valor1;
                n3 = valor2;
            }
            else{
                n2 = valor2;
                n3 = valor1;
            }
        }
        JOptionPane.showMessageDialog(null, "Ordem crescente: " + n1 + " " + n2 + " " + n3);
    }
}
