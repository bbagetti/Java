import java.util.Scanner;

public class Aula_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par: " + numero);
        }else{
            System.out.println("Ímpar: " + numero);
        }


    }
}
