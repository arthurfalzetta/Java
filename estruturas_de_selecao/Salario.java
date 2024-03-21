import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class Salario {
    public static void main(String[] args) {
        double valorHora;
        int horas;
        double imposto;
        double comissao;

        valorHora = parseDouble(showInputDialog("Insira o valor recebido por hora de trabalho"));
        horas = parseInt(showInputDialog("Insira o número de horas trabalhadas"));
        imposto = parseDouble(showInputDialog("Insira o valor do imposto aplicado sobre o salário"));
        comissao = parseDouble(showInputDialog("Insira o valor da comissão"));

        double salarioBruto = valorHora * horas;

        if (horas >= 120) {
            double salarioLiquido = salarioBruto - (salarioBruto*imposto) + comissao;
            showMessageDialog(null, "O seu salário bruto é de R$" + salarioBruto + " e seu salário líquido é R%" + salarioLiquido);
        }
        else{
            double salarioLiquido = salarioBruto - (salarioBruto*imposto);
            showMessageDialog(null, "O seu salário bruto é de R$" + salarioBruto + " e seu salário líquido é R%" + salarioLiquido);
        }
    }
}
