
import javax.swing.JOptionPane;
public class ex8 {
    public static String numeroPrimo(int c){
        String msg = "";
        for(int d = 2; d <= c; d++){
            if(c%d==0){
                if(c==2){
                    msg = c + " é um número primo";
                    break;
                }
                msg = c + " não é um número primo";
                break;
            }
            if(d == c-1){
                msg = c + " é um número primo";
                break;
            }
        }
        return msg;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        String primo = numeroPrimo(num);
        JOptionPane.showMessageDialog(null, "O número " + primo);
    }
}
