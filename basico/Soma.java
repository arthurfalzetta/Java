import javax.swing.JOptionPane;
public class Soma {
    public static void main(String... args){
        double A;
        double B;
        double soma;

        A = 
        Double.parseDouble(JOptionPane.showInputDialog("Valor A:"));
        B = 
        Double.parseDouble(JOptionPane.showInputDialog("Valor B:"));

        soma = A + B;

        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }

}
