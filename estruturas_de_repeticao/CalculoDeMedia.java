import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
public class CalculoDeMedia {
    public static void main(String[] args) {
        double nota1;
        double  nota2;
        int alunos;
        int contador;

        alunos = parseInt(showInputDialog("Quantos alunos?"));

        contador = 1;


        while (contador <= alunos) {
            nota1 = parseDouble(showInputDialog("Insira a primeira nota do aluno"));
            nota2 = parseDouble(showInputDialog("Insira a sengunda nota"));
            double media = (nota1+nota2)/2;
            if (nota1 <= 10 && nota2 <= 10) {
                
                if (media < 5) {
                    showMessageDialog(null, "Aluno reprovado\nMédia = " + media);
                }
                else{
                    showMessageDialog(null, "Aluno aprovado\nMédia = " + media);
                }
                contador += 1;
            }
            else{
                showMessageDialog(null, "Nota inválida, insira outra");
            }
        }
    }
}
