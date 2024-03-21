import java.util.Scanner;

public class Primo{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número");
        int num = leitor.nextInt();
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("O número " + num + " é primo");
        }
        else{
            System.out.println("Não é primo");
        }
    }
}
