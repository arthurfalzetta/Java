import java.util.Scanner;

public class IfESuasVariacoes {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        final int VALOR_MINIMO = 0, VALOR_MAXIMO = 10;
        System.out.println("Qual a nota?");
        var nota = leitor.nextDouble();
        // if (nota >= 6) {
        //     System.out.println("Aprovado");
        //     System.out.println("Parabéns");
        // }
        // else{
        //     System.out.println("De recuperação");
        // }
        if(nota >= 0 && nota <=10){
            if(nota >= 9){
                System.out.println("A");
                System.out.println("Parabés");
            } 
            else if (nota >= 8){
                System.out.println("B");
            }
            else if (nota >= 6) {
                System.out.println("C");
            }
            else{
                System.out.println("REPROVADO!!!!!!!!!");
            }
            
        }
        else{
            System.out.println("Nota inválida");
        }
    leitor.close();
    }
}
