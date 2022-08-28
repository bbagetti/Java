import java.util.Scanner;

public class Exercicio_13_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário:");
        int salario = scan.nextInt();
        System.out.println("Digite o valor do lanche:");
        int lanche = scan.nextInt();
        int contador = 1;

        for (int i = salario; i > 0; i = i - lanche){
            System.out.println(i + " - " + (contador++));
        }
    }
}
