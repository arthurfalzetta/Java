import java.util.Scanner;
public class Carga {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.println("Insira o código de estado");
        var codigo = leitor.nextDouble();
        System.out.println("Insira o valor inicial de carga");
        var carga = leitor.nextDouble();

        
        if (codigo == 2 || codigo ==5) {
            var cargaFinal = carga - (carga*0.12);
            System.out.printf("O valor final da carga é %.2f", cargaFinal);
        }
        else if (codigo == 1 || codigo == 3 || codigo == 4) {
            var cargaFinal2 = carga - (carga*0.15);
            System.out.printf("O valor final da carga é %.2f", cargaFinal2);
        }
        else{
            System.out.println("Insira um código válido");
        }
    }
}
