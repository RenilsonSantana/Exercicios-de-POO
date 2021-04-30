/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */

class Calculadora {

    private double valor1, valor2, valorCalculado;
    private char operador;

    public Calculadora(double n1, double n2, char operador) {
        this.valor1 = n1;
        this.valor2 = n2;
        this.operador = operador;
    }

    public void Calcular() throws Exception {
        switch (this.operador) {
            case '+':
                valorCalculado = valor1 + valor2;
                break;
            case '-':
                valorCalculado = valor1 - valor2;
                break;
            case '*':
                valorCalculado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    valorCalculado = valor1 / valor2;
                } else {
                    throw new Exception("O divisor não pode ser 0");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
        }
    }

    public void MostrarValor() {
        JOptionPane.showMessageDialog(null, "Valor calculado: " + this.valorCalculado);
    }
}
