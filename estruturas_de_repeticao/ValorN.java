import java.util.Scanner;
public class ValorN {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um número inteiro");
        int N = leitor.nextInt();
        double fatorial = 1;
        double e = 1;
        int i = 1;

        // for (int i = 1; i <= N; i++) {
        //     fatorial *= i;
        //     e += 1/fatorial;
        // }
        // System.out.println(e);

        // while(i<=N){
        //     fatorial*=i;
        //     e += 1/fatorial;
        //     i++;
        // }
        // System.out.println(e);

        do {
            fatorial*=i;
            e += 1/fatorial;
            i++;
        } while (i<=N);
        System.out.println(e);
    }
}
