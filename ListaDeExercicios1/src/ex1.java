
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
public class ex1 {
    public static void main(String[] args) {
        String produto;
        double valor, valorComDesconto;
        Scanner in = new Scanner(System.in);
        System.out.println("Produto: ");
        produto = in.next();
        System.out.println("Valor: ");
        valor = in.nextDouble();
        valorComDesconto = valor - valor*0.09;
        System.out.printf("valor final: R$ %.2f", valorComDesconto);
    }
}
