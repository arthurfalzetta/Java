import java.util.Scanner;
public class NumerosInteiros {
    public static void main(String[] args) {
        // Scanner leitor = new Scanner(System.in);

        // int num1;
        // int num2;

        // System.out.println("Digite o primeiro número inteiro");
        // num1 = leitor.nextInt();
        // System.out.println("Digite o segundo número inteiro");
        // num2 = leitor.nextInt();
        var leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        var num1 = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        var num2 = leitor.nextInt();

        if (num1 > num2) {
            System.out.println("primeiro maior que o segundo");
        }
        else{
            System.out.println("segundo maior que o primeiro");
        }
    }
}
