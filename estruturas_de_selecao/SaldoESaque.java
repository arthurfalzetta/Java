import java.util.Scanner;
public class SaldoESaque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o saldo da sua conta");
        double saldo = leitor.nextDouble();
        System.out.println("Digite o valor que deseja sacar");
        double saque = leitor.nextDouble();
        double resto;

        if (saldo >= saque) {
            resto = saldo - saque;
            System.out.println("Restaram " + resto + " reais na sua conta");
        }
        else{
            System.out.println("Não foi possível realizar o saque");
        }
    }
}
