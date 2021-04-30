/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BmnGamer
 */
import javax.swing.JOptionPane;

public class Superior {
    protected double n1;
    protected double n2;
    protected double n3;

    Superior() {

    }

    Superior(double n1, double n2, double n3) {
      this.n1 = n1;
      this.n2 = n2;
      this.n3 = n3;
    }

    public double CalculaMedia() 
    {
        return (this.n1 * 0.35 + this.n2 * 0.5 + this.n3 * 0.15);
    }

    public double getN1(){
        return n1;
    }

    public void setN1(double n1){
        this.n1 = n1;
    }

    public double getN2(){
        return n2;
    }

    public void setN2(double n2){
        this.n2 = n2;
    }

    public double getN3(){
        return n3;
    }

    public void setN3(double n3){
        this.n3 = n3;
    }
    
    public void pegaNotas(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 1 do Superior")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 2 do Superior")));
        setN3(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 3 do Superior")));
    }

    public void imprimirMedia(double media){
        JOptionPane.showMessageDialog(null, "Média final: " + media);
    }
}