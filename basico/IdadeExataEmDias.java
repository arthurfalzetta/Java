import java.util.Scanner;
public class IdadeExataEmDias {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double anos;
        double meses;
        double dias;
        double resultado;

        System.out.println("Seus anos de vida");
        anos = leitor.nextDouble();
        System.out.println("Meses desde o ultimo aniversario");
        meses = leitor.nextDouble();
        System.out.println("Dias desde o ultimo mesversario");
        dias = leitor.nextDouble();

        resultado = (anos*365) + (meses*30) + dias;

        System.out.printf(
            "Sua idade exata em dias é de: %.0f dias",
            resultado);
    }
}
