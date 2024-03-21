//import java.util.Scanner;
public class PodeDirigir {
    public static void main(String[] args) {
        var leitor = new java.util.Scanner(System.in);
        System.out.println("Digite a idade");
        var idade = leitor.nextShort();

        // if (idade >= 18)
        //     System.out.println("Pode dirigir");
        // else
        //     System.out.println("Não pode dirigir");

        System.out.println(idade >= 18 ? "Sim" : "Não");

        leitor.close();
    }
    
}
