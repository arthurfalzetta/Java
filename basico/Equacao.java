import javax.swing.JOptionPane;
import java.lang.String;
public class SomaDoisNumeros {
    public static void main(String args []){
        
        //declaração de variáveis
        double primeiroNumero;
        double segundoNumero;
        double terceiroNumero;
        double quartoNumero;
        double resultado;

        //entrada
        //classe empacotadora (wrapper)
        primeiroNumero = 
        Double.parseDouble(JOptionPane.showInputDialog("Escolha o primeiro numero"));
        segundoNumero =
        Double.parseDouble(JOptionPane.showInputDialog("Escolha o segundo numero"));
        terceiroNumero = 
        Double.parseDouble(JOptionPane.showInputDialog("Escolha o terceiro numero"));
        quartoNumero =
        Double.parseDouble(JOptionPane.showInputDialog("Escolha o quarto numero"));

        //processamento
        resultado = Math.pow(primeiroNumero, 2) + Math.pow(segundoNumero,2) + Math.pow(terceiroNumero, 2) + Math.pow(quartoNumero, 2);

        //saida
        JOptionPane.showMessageDialog(null, resultado);
    }
}