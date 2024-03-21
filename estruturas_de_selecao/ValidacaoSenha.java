import java.util.Scanner;
public class ValidacaoSenha {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);

        System.out.println("Insira o primeiro digito da senha");
        var a = leitor.nextDouble();
        System.out.println("Insira o segundo digito da senha");
        var b = leitor.nextDouble();
        System.out.println("Insira o terceiro digito da senha");
        var c = leitor.nextDouble();
        System.out.println("Insira o quarto digito da senha");
        var d = leitor.nextDouble();

        if (a == 8 || a == 5){
            if (d == 5 || d == 1) {
                if (d==5){
                    var soma = b + c;
                    if(soma == 3){
                        System.out.println("A senha é válida");
                    }
                    else{
                        System.out.println("Senha inválida");
                    }
                }
                else if (d==1) {
                    var soma2 = b + c;
                    if (soma2 == 0) {
                        System.out.println("A senha é válida");
                    }
                    else{
                        System.out.println("Senha inválida");
                    }
                }
            }
            else{
                System.out.println("Senha não válida");
            }
        }
        else{
            System.out.println("Senha não válida");
        }
    }
}
