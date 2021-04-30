/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
public class ex5 {
    public static void main(String[] args) { 
        String input; 
        input = JOptionPane.showInputDialog("Digite o limite superior");
        int limite = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Digite o intervalo de números"); 
        int intervalo = Integer.parseInt(input); 
        String msg = " "; 
        try{
            if(limite <= 0 || intervalo <= 0){
                throw new Exception(); 
            } 
            for(int c = 0; c <= limite; c += intervalo){
                msg += " " + c;
            }
            JOptionPane.showMessageDialog(null, "Números no intervalo informado:" + msg);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "O limite e nem o intervalo pode ser 0 ou menor!"); 
        } 
    }
}
