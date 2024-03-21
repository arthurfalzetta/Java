import java.util.Scanner;
public class AreaDoCirculo{
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double r;
        double A;

        System.out.println("Digite o valor de r");
        r = leitor.nextDouble();

        A = Math.PI * (Math.pow(r, 2));

        System.out.printf("A area do circulo de raio %.2f eh %.2f",
        A, r);


    }
}