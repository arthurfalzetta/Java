import java.util.Scanner;
public class Eleicao {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        double eleitores;
        double brancos;
        double nulos;
        double validos;
        double p1;
        double p2;
        double p3;

        System.out.println("Quantidade de eleitores");
        eleitores = leitor.nextDouble();
        System.out.println("Número de votos branco");
        brancos = leitor.nextDouble();
        System.out.println("Número de votos nulos");
        nulos = leitor.nextDouble();
        System.out.println("Número de votos validos");
        validos = leitor.nextDouble();

        p1 = (brancos*100)/eleitores;
        p2 = (nulos*100)/eleitores;
        p3 = (validos*100)/eleitores;

        System.out.printf(
            "No municipio com %.0f eleitores, %.0f porcento dos votos foram branco, %.0f porcento dos votos foram nulos e %.0f porcento dos votos foram válidos",
            eleitores, p1, p2, p3);
    }
}
