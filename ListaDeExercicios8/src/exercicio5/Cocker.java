/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
public class Cocker extends Cachorro{
    private boolean tosa;

    public Cocker(String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
    }

    public boolean isTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public String precisaTosa(){
        if(tosa){
            return "Não precisa de tosa";
        }
        return "Precisa de tosa";
    } 
}
