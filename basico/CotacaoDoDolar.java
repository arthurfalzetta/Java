import javax.swing.JOptionPane;
import java.lang.String;
public class SomaDoisNumeros {
    public static void main(String args []){
        
        //declaração de variáveis
        double primeiroNumero;
        double segundoNumero;
        double resultado;

        //entrada
        //classe empacotadora (wrapper)
        primeiroNumero = 
        Double.parseDouble(JOptionPane.showInputDialog("Cotacao do Dolar"));
        segundoNumero =
        Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Dolares"));

        //processamento
        resultado = primeiroNumero * segundoNumero;

        //saida
        JOptionPane.showMessageDialog(null, "Os " + segundoNumero + " Que voce possui correspondem a " + resultado + " reais");
    }
}