import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        System.out.println("Digite o número de funcionários da empresa");
        int quantidadeFuncionarios = leitor.nextInt();
        System.out.println("Digite o salário mínimo dos funcionarios");
        double salarioMinimo = leitor.nextDouble();
        double salario;
        leitor.nextLine();
        for (int i = 1; i <= quantidadeFuncionarios; ) {
            System.out.println("Digite o turno do trabalhador");
            String turno = leitor.nextLine();
            System.out.println("Digite a categoria do funcionário");
            String categoria = leitor.nextLine();
            System.out.println("Insira as horas trabalhadas");
            double horasTrabalhadas = leitor.nextDouble();
            
            double valorHoraTrabalhada;
            if (categoria == "G") {
                if (turno == "N") {
                     valorHoraTrabalhada= (0.18 * salarioMinimo);
                    i++;
                    System.out.println("O valor da hora trabalhada é: " + valorHoraTrabalhada +"R$");
                }
                else if (turno == "M" || turno == "V") {
                    valorHoraTrabalhada = (0.15 * salarioMinimo);
                    i++;
                    System.out.println("O valor da hora trabalhada é: " + valorHoraTrabalhada +"R$");
                }
                else{
                    System.out.println("Turno inválido, insira M, V ou N");
                }
            }
            else if (categoria == "O") {
                if (turno == "N") {
                    valorHoraTrabalhada = (0.13 * salarioMinimo); 
                    i++;
                    System.out.println("O valor da hora trabalhada é: " + valorHoraTrabalhada +"R$");
                }
                else if (turno == "M" || turno == "V") {
                    valorHoraTrabalhada = (0.1 * salarioMinimo);
                    i++;
                    System.out.println("O valor da hora trabalhada é: " + valorHoraTrabalhada +"R$");
                }
                else{
                    System.out.println("Turno inválido, insira M, V ou N");
                }
            }
            else{
                System.out.println("Categoria inválida, insira G ou O");
            }
        }
    }
}
