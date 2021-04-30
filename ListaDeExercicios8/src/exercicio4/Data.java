/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author BmnGamer
 */
class Data {

    private int mes, dia, ano;

    public Data(int dia, int mes, int ano) throws Exception {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            throw new Exception();
        }
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else {
            throw new Exception();
        }
        if (ano > 1900 && ano < 2099) {
            this.ano = ano;
        } else {
            throw new Exception();
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData() {
        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
    }
}
