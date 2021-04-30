/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author BmnGamer
 */
public class Animal {
    private String tipo;
    private String cor;

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", cor=" + cor + '}';
    }
}
