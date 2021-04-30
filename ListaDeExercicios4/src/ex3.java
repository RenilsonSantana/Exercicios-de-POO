
import javax.swing.JOptionPane;
public class ex3 {
    public static double calcProduto (double x, double y){
        double produto = x * y;
        return produto;
    }

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor!"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor!"));

        double produto = calcProduto(num1, num2);
        JOptionPane.showMessageDialog(null, "O produto dos valores " + num1 + " e " + num2 + " é igual a " + produto);
    }
}
