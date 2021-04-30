
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
public class ex3 {
    public static void main(String[] args) {
        float v1, v2;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        v1 = in.nextFloat();
        System.out.print("Digite o 2º valor: ");
        v2 = in.nextFloat();
        System.out.printf("Média dos valores: %.1f", (v1+v2)/2);
    }
}
