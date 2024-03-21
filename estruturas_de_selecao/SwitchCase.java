import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Byte.parseByte;
public class SwitchCase {
    public static void main(String[] args) {
        //declaração de variáveis
        double valor;
        //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
        byte opcao;
        //entrada
        valor = parseDouble(showInputDialog("Digite o valor"));
        opcao = parseByte(showInputDialog("0 - A vista\n1-Cartao\n2-Crediario"));
        //processamentos
        switch(opcao){
            case 0:{
                showMessageDialog(null, "O valor a ser pago é: " + valor * 0.9);
            }
                break;
            case 1:{
                byte parcelas = parseByte(showInputDialog("Escolha a quantidade de parcelas que você quer pagar a compra"));
                showMessageDialog(null, "Valor da parcela: " + valor / parcelas);
            }
            case 2:{
                byte parcelas = parseByte(showInputDialog("Escolha o número de parcelas:"));
                showMessageDialog(null, "Valor da parcela: " + valor * 1.1 / parcelas);
                break;
            }
            default:{
                showMessageDialog(null, "Opção inválida");
            }

                break;
        }
        //saída
    }
}
