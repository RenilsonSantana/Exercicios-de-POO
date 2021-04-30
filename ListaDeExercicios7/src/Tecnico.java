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

public class Tecnico extends Superior
{
    Tecnico(){
        super();
    }

    Tecnico(double n1, double n2, double n3){
        super(n1, n2, n3);
    }

    @Override
    public double CalculaMedia(){
        return (this.n1 + this.n2*2 + this.n3*2)/5;
    }
    
    @Override
    public void pegaNotas(){
        setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 1º trimestre do Tecnico")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 2º trimestre do Tecnico")));
        setN3(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 3º trimestre do Tecnico")));
    }
}
