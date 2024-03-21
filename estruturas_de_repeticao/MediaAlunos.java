import java.util.Scanner;
public class MediaAlunos{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somanotas = 0;



        for (int i = 1; i <= 6; i++) {
            System.out.println("Insira a primeira nota");
            double nota1 = leitor.nextDouble();
            System.out.println("Insira a segunda nota");
            double nota2 = leitor.nextDouble();
            double media = (nota1 + nota2)/2;
            System.out.println("A media é: " + media);
            if (media > 7) {
                System.out.println("Aprovado");
                aprovados++;
            }
            else if (media > 3 && media < 7) {
                System.out.println("Exame");
                exame++;
            }
            else if (media<3) {
                System.out.println("Reprovado");
                reprovados++;
            }
            somanotas += media;
            
        }
        System.out.println("O numero de alunos aprovados é: " + aprovados);
        System.out.println("O numero de alunos de exame é: " + exame);
        System.out.println("O numero de alunos reprovados é: " + reprovados);
        System.out.println("A media fina é: " + somanotas/6);
    }
}