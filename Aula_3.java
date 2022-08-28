import java.util.Scanner;

public class Aula_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String texto = scan.nextLine();
        System.out.println("Digite um número:");
        int qtd = scan.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println(i + " - " + texto);
        }
    }
}
