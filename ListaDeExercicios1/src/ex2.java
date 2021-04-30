
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BmnGamer
 */
public class ex2 {
    public static void main(String[] args) {
        double salarioMin, salario;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o salario minimo: ");
        salarioMin = in.nextDouble();
        System.out.print("Digite seu salario: ");
        salario = in.nextDouble();
        System.out.printf("Você ganha: %.1f salarios minimo", salario/salarioMin);
    }
}
