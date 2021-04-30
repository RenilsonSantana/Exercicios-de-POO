/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

import javax.swing.JOptionPane;
public class ex2 {
    static long fibo(int n){
        if(n < 2){
            return n;
        } else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("Digite quantos termos Fibonacci deseja");
        int valor1 = Integer.parseInt(input);
        String msg = " ";
        try {
            if (valor1 <= 0) {
                throw new Exception();
            }
            for (int i = 0; i < valor1; i++) {
                msg += fibo(i + 1) + " ";
            }
          JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até o " + valor1 + "º termo:" + msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O valor deve ser maior que 0!");
        }
    }
}
