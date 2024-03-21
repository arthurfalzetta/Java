import java.util.Scanner;
public class IdadeEmDias {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double anos;
        double dias;

        System.out.println("Coloque aqui sua idade");
        anos = leitor.nextDouble();

        dias = anos * 365;

        System.out.printf(
            "A sua idade em dias é de: %.0f dias",
            dias);
    }
}