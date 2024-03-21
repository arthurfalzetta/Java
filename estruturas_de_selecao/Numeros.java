import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args) {
        double num1;
        double num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é o maior");
        }
        else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "segundo é o maior");
        }
    }
}
