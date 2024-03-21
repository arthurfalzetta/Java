import java.util.Scanner;
public class ReajusteSalario {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double salario;
        double reajuste;
        double resultado;

        System.out.println("Salário atual");
        salario = leitor.nextDouble();
        System.out.println("Valor do reajuste salarial");
        reajuste = leitor.nextDouble();

        resultado = salario + (salario*(reajuste/100));

        System.out.printf(
            "O valor do salário após o reajuste é de: %.2f reais",
            resultado);
    }
}
