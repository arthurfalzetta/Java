import java.util.Scanner;
public class Comissao {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double q;
        double p;
        double c;

        System.out.println("Quantidade vendida da peça");
        q = leitor.nextDouble();
        System.out.println("Preço da peça");
        p = leitor.nextDouble();

        c = 0.05 * (q * p);

        System.out.printf(
            "A comissao foi de %.2f reais",
            c
        );
    }
}
