/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author BmnGamer
 */
public class Empregado extends Pessoa{
    private double salario;

    public Empregado(double salario, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double obterLucro(){
        return this.salario;
    }
}
