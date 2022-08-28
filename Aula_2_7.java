import java.util.Scanner;

public class Aula_2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        while(opcao != 2) {
            System.out.println("-- Qual opção --");
            System.out.println("(1) Repetir");
            System.out.println("(2) Sair");
            opcao = scan.nextInt();
        }
    }
}
