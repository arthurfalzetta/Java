import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;
public class VariasContinhas {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        double valorDigitado;
        double soma = 0;//acumuladora
        int quantidadeDigitados = 0;//acumulador e contador
        double media = 0;//acumulador
        double maior = -1;
        double menor = -1;
        double mediaPares = 0;//acumulador
        double percentualImpares = 0;//acumulador
        do {
            System.out.println("Digite um valor");
            valorDigitado = leitor.nextDouble();
            if (valorDigitado != 30000) {
                soma = soma + valorDigitado;
                quantidadeDigitados += 1;
                media = media + valorDigitado;
                // if (maior < 0)
                //     maior = valorDigitado;
                // else if (valorDigitado > maior)
                //     maior = valorDigitado;
                if(maior < 0 || valorDigitado > maior) maior = valorDigitado;
                menor = menor == -1 || valorDigitado < menor? valorDigitado : menor;
                // mediaPares = valorDigitado % 2 ==0 ? mediaPares + valorDigitado : mediaPares;
                mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);
                percentualImpares += valorDigitado % 2;
            }
            
        } while (valorDigitado != 30000);
        System.out.println("Soma: " + soma);
        System.out.println("Qtd digitados: " + quantidadeDigitados);
        System.out.println("Média: " + (media / quantidadeDigitados) );
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média pares: " + (mediaPares / (quantidadeDigitados - percentualImpares)));
        System.out.println("Percentual Impares: " + ((percentualImpares/quantidadeDigitados) * 100) + "%");
    }
}
