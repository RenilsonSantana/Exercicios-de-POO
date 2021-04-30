
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
public class ex4 {
    public static void main(String[] args) {
        float c, f;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a temperatura em °C: ");
        c = in.nextFloat();
        f = (9*c+160)/5;
        System.out.printf("Convertido em ºF%.1f", f);
    }
}
