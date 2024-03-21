import java.util.Scanner;
public class Retangulo {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Valor da base do retangulo");
        base = leitor.nextDouble();
        System.out.println("Valor da altura do retangulo");
        altura = leitor.nextDouble();

        area = base * altura;

        System.out.println("A area do retangulo eh: " + area);
    }
}
