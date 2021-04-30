/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

import javax.swing.JOptionPane;
public class ex1 {
    public static void main(String[] args) { 
        String input; 
        input = JOptionPane.showInputDialog("Digite o valor inicial");
        int valorInicial = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Digite o valor final"); 
        int valorFinal = Integer.parseInt(input); 
        String msg = " "; 
        try{
            if(valorInicial > valorFinal){
                throw new Exception(); 
            } 
            for(int c = valorInicial; c <= valorFinal; c++){
                if(c%2==0){
                    msg += " " + c;
                } 
            }
            JOptionPane.showMessageDialog(null, "Números pares no intervalo informado:" + msg);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "O valor inicial deve ser menor do que o valor final!"); 
        } 
    }
}
