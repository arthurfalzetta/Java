import java.util.Scanner;
public class Cardapio {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.println("Escolha seu pedido");
        var pedido = leitor.nextDouble();

        if (pedido == 1) {
            System.out.println("Misto quente ---- Bom apetite, vai lhe custar: R$5,50");
        }
        else if (pedido == 2) {
            System.out.println("Salada chinesa ---- Bom apetite, vai lhe custar: R$10,20");
        }
        else if (pedido == 3) {
            System.out.println("Suco de laranja ---- Tenha um excelente drink, vai lhe custar: R$4,00");
        }
        else if (pedido == 4) {
            System.out.println("Suco de manga ---- Tenha um excelente drink, vai lhe custar R$3,50");
        }
        else{
            System.out.println("ERRO ---- O número inserido não corresponde a nenhum número do cardápio. Escolha um número entre 1 e 4.");
        }
    }
}
