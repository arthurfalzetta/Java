import java.util.Scanner;
public class SalarioFinal{
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double salario;
        double comissao;
        double carros;
        double valor;
        double porcentagem;
        double total;
        double salariofinal;

        System.out.println("Digite seu salario");
        salario = leitor.nextDouble();
        System.out.println("Digite o valor da comissao");
        comissao = leitor.nextDouble();
        System.out.println("Digite o numero de carros vendidos");
        carros = leitor.nextDouble();
        System.out.println("Digite o valor total das vendas");
        valor = leitor.nextDouble();

        porcentagem = valor * 0.05;
        total = comissao * carros;
        salariofinal = salario + total + porcentagem;

        System.out.printf("O salario final do vendedor é de %.2f reais",
        salariofinal);
    }
}