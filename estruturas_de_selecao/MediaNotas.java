import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.println("Insira sua primeira nota");
        var nota1 = leitor.nextDouble();
        System.out.println("Insira sua segunda nota");
        var nota2 = leitor.nextDouble();

        var media = (nota1 + nota2)/2;

        if (media >= 9 && media <= 10) {
            System.out.println("Parabéns, continue assim");
        }
        else if (media >= 7 && media <9){
            System.out.println("Aprovado.");
        }
        else if (media >= 6 && media < 7) {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        }
        else if (media >= 2 && media < 6) {
            System.out.println("Não está aprovado, mas ainda pode fazer a prova substituta.");
        }
        else if (media < 2) {
            System.out.println("Reprovado. Nos vemos semestre que vem.");
        }
        else{
            System.out.println("Notas inseridas não são válidas");
        }
    }
}
