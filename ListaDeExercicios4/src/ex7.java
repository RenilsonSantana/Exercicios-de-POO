
import javax.swing.JOptionPane;
public class ex7 {
    public static int fatorial(int num){
        int fatorial = num;
        for(int c = num; c >= 2; c--){
            fatorial *= (c-1);
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        fatorial(num);
        int valorFatorial = fatorial(num);
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é igual a: " + valorFatorial);
    }
}
