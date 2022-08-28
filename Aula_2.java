import java.util.Scanner;

public class Aula_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu signo:");
        String signo = scan.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Signo: " + signo);
        System.out.println("Idade: " + idade);
    }
}
