import java.util.Scanner;
public class NumerosReais {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número real");
        var num1 = leitor.nextDouble();
        System.out.println("Digite o segundo número real");
        var num2 = leitor.nextDouble();

        if (num1 == num2) {
            System.out.println("Os números reais são iguais");
        }
    }
}
