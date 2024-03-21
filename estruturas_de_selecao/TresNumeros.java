import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import java.util.Arrays;
public class TresNumeros {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;

        num1 = parseDouble(showInputDialog("Insira o primeiro valor"));
        num2 = parseDouble(showInputDialog("Insira o segundo valor"));
        num3 = parseDouble(showInputDialog("Insira o terceiro valor"));

        double [] numeros = {num1,num2,num3};

        if (num1 != num2 && num1 != num3 && num2 != num3) {
           for(double numero : numeros){
            showMessageDialog(null, numero);
           }
        }
        else if (num1 == num2 && num2 == num3) {
            showMessageDialog(null, "ERRO!");
        }
    }
}
