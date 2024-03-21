import java.util.Scanner;
public class PecaDeRoupa {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.println("Digite o valor da peça de roupa");
        var valor = leitor.nextDouble();
        System.out.println("Digite o código do tipo de pagamento");
        var codigo = leitor.nextDouble();

        if (codigo == 0) {
            var r1 = valor - (valor*0.1);
            System.out.printf("O preço que será pago à vista é de %.2f reais",
            r1);
        }
        else if (codigo == 1) {
            System.out.println("Digite o a quantidade de parcelas em que você vai pagar a peça");
            var parcelas = leitor.nextDouble();
            var r2 = valor/parcelas;
            System.out.printf("O valor de cada parcela é de %.2f reais",
            r2);
        }
        else if (codigo == 2) {
            System.out.println("Digite o número de parcelas em que você vai pagar a peça");
            var parcelas2 = leitor.nextDouble();
            var r2 = (valor/parcelas2)*1.1;
            System.out.printf("O valor de cada parcela a ser paga é de %.2f reais",
            r2);
        }
        else{
            System.out.println("Opção inválida");
        }
    }
}
