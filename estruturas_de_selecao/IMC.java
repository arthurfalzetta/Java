import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.println("Insira seu peso em kg");
        var peso = leitor.nextDouble();
        System.out.println("Insira sua altura em metros");
        var altura = leitor.nextDouble();

        var imc = peso / (altura*altura);
        System.out.printf("O IMC é: %.4f",imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal, muito bem");
        }
        else if (imc >= 24.9 && imc <=29.9) {
            System.out.println("Sobrepeso, um regime leve pode ajudar");
        }
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade leve");
        }
        else if (imc >= 35 && imc <=39.9) {
            System.out.println("Obesidade moderada");
        }
        else if (imc >= 40) {
            System.out.println("Obesidade mórbida");
        }
    }
}
