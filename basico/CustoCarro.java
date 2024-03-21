import java.util.Scanner;
public class CustoCarro {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double custo;
        double valor;
        double distribuidor;
        double impostos;

        System.out.println("Custo de fábrica do carro");
        custo = leitor.nextDouble();

        distribuidor = custo*45/100;
        impostos = custo*28/100;
        valor = custo+distribuidor+impostos;

        System.out.printf("O valor final do carro é de: %.2f reais",
        valor);
    }
}
