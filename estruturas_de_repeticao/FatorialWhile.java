import javax.swing.JOptionPane;

public class FatorialWhile {
    public static void main(String[] args) {
        int num;
        int fatorial;
        int i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));
        fatorial = 1;
        i = 1;


        while (i <= num) {
            fatorial = fatorial * i;
            i = i + 1;
        }
        JOptionPane.showMessageDialog(null, fatorial);
    }
}
