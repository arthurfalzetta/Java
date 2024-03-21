import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class FatorialFor {
    public static void main(String[] args) {
        int numero;
        int fatorial;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número inteiro"));
        fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        
        }
        showMessageDialog(null, fatorial);
    }
}
