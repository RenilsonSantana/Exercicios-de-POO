/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

import javax.swing.JOptionPane;
public class ex4 {
    public static void main(String[] args) { 
        String input; 
        input = JOptionPane.showInputDialog("Digite a sua nota de P1: ");
        double p1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Digite a sua nota de P2: ");
        double p2 = Double.parseDouble(input); 
        input = JOptionPane.showInputDialog("Digite a sua nota de Trabalho: ");
        double trabalho = Double.parseDouble(input); 
        try{
            if(p1 > 10 || p1 < 0 || p2 > 10 || p2 < 0 || trabalho > 10 || trabalho < 0){
                throw new Exception(); 
            } 
            double notaFinal = p1*0.35+p2*0.5+trabalho*0.15;
            JOptionPane.showMessageDialog(null, "Sua nota final é: " + notaFinal);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "As notas devem ser entre 0 e 10!"); 
        } 
    }
}
