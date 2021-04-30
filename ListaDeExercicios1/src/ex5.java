
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
public class ex5 {
    public static void main(String[] args) {
        float altura, volume, raio;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a altura da lata: ");
        altura = in.nextFloat();
        System.out.print("Digite a o raio da lata: ");
        raio = in.nextFloat();
        volume = (float) (3.14159f * Math.pow(raio, 2) * altura);
        System.out.printf("Volume da lata: %.1f", volume);
    }
}
