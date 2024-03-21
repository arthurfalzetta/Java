import java.util.Scanner;
public class MediaNotas {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double A;
        double B;
        double C;
        double media;

        System.out.println("Nota A:");
        A = leitor.nextDouble();
        System.out.println("Nota B:");
        B = leitor.nextDouble();
        System.out.println("Nota C:");
        C = leitor.nextDouble();

        media = ((A*2) + (B*3) + (C*5))/10;

        System.out.printf(
            "A media final do aluno eh: %.2f",
            media);
    }
}
