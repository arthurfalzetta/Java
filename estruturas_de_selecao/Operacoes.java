import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a;
        double b;
        double c;
        double soma;
        double media;
        double produto;

        System.out.println("Digite o primeiro número");
        a = leitor.nextDouble();
        System.out.println("Digite o segundo número");
        b = leitor.nextDouble();
        System.out.println("Digite o segundo número");
        c = leitor.nextDouble();

        soma = a + b + c;
        System.out.println(soma);
        media = (a+b+c)/3;
        System.out.println(media);
        produto = a*b*c;
        System.out.println(produto);

        if (a>b && b>c) {
            System.out.println(a + " é o maior");
            System.out.println(c + " é o menor");
        }
        else if (a>c && c>b) {
            System.out.println(a + " é o maior");
            System.out.println(b + " é o menor");
        }
        else if (b>a && a>c) {
            System.out.println(b + " é o maior");
            System.out.println(c + " é o menor");
        }
        else if (b>c && c>a) {
            System.out.println(b + " é o maior");
            System.out.println(a + " é o menor");
        }
        else if (c>a && a>b) {
            System.out.println(c + " é o maior");
            System.out.println(b + " é o menor");
        }
        else if (c>b && b>a) {
            System.out.println(c + " é o maior");
            System.out.println(a + " é o menor");
        }
    }
}
