import java.util.Scanner;
public class Antecessor {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.println("Escolha um numero");
        numero = leitor.nextInt();

        resultado = numero - 1;

        System.out.println("O antecessor do valor escolhido eh:" + resultado);
    }
}
