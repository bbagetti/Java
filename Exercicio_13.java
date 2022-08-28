import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite um número");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println(i + " - " + nome);
        }

    }
}
