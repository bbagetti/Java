import java.sql.SQLOutput;
import java.util.Scanner;

public class Aula_2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro número:");
        int numero2 = scan.nextInt();

        System.out.println("Soma = " + (numero1 + numero2));
        int numero3 = numero1 + numero2;

        System.out.println("Multiplicação = " + (numero1 * numero2));
        int numero4 = numero1 * numero2;

        if (numero3 == numero4) {
            System.out.println("Soma == Multiplicação");
        }else{
            System.out.println("Soma != Multiplicação");
        }
    }
}
