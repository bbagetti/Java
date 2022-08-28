import java.util.Scanner;

public class Exercício_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        int numero1 = scan.nextInt();

        System.out.println("Digite o 2º número:");
        int numero2 = scan.nextInt();

        System.out.println("Digite o 3º número:");
        int numero3 = scan.nextInt();

        System.out.println("Digite o 4º número:");
        int numero4 = scan.nextInt();

        System.out.println("Digite o 5º número:");
        int numero5 = scan.nextInt();

        if ((numero1 > numero2) && (numero1 > numero3) && (numero1 > numero4) && (numero1 > numero5)) {
                System.out.println("O maior: " + numero1);
            }
        if ((numero2 > numero1) && (numero2 > numero3) && (numero2 > numero4) && (numero2 > numero5)) {
                System.out.println("O maior: " + numero2);
            }
        if ((numero3 > numero1) && (numero3 > numero2) && (numero3 > numero4) && (numero3 > numero5)) {
            System.out.println("O maior: " + numero3);
        }
        if ((numero4 > numero1) && (numero4 > numero2) && (numero4 > numero3) && (numero4 > numero5)) {
            System.out.println("O maior: " + numero4);
        }
        if ((numero5 > numero1) && (numero5 > numero2) && (numero5 > numero4) && (numero5 > numero3)) {
            System.out.println("O maior: " + numero5);
        }

        if ((numero1 < numero2) && (numero1 < numero3) && (numero1 < numero4) && (numero1 < numero5)) {
            System.out.println("O menor: " + numero1);
        }
        if ((numero2 < numero1) && (numero2 < numero3) && (numero2 < numero4) && (numero2 < numero5)) {
            System.out.println("O menor: " + numero2);
        }
        if ((numero3 < numero1) && (numero3 < numero2) && (numero3 < numero4) && (numero3 < numero5)) {
            System.out.println("O menor: " + numero3);
        }
        if ((numero4 < numero1) && (numero4 < numero2) && (numero4 < numero3) && (numero4 < numero5)) {
            System.out.println("O menor: " + numero4);
        }
        if ((numero5 < numero1) && (numero5 < numero2) && (numero5 < numero3) && (numero5 < numero4)) {
            System.out.println("O menor: " + numero5);
        }

    }
}
