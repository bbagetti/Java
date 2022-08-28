import java.util.Scanner;

public class Aula_2_2 {
    public static void main(String[] args) {
        Scanner scanTexto = new Scanner(System.in);
        Scanner scanNumero = new Scanner(System.in);

        System.out.println("Digite o nome do seu pai:");
        String nomePai = scanTexto.nextLine();

        System.out.println("Digite a idade do seu pai:");
        int idadePai = scanNumero.nextInt();

        System.out.println("Digite o nome da sua mãe:");
        String nomeMae = scanTexto.nextLine();

        System.out.println("Digite a idade da sua mãe");
        int idadeMae = scanNumero.nextInt();

        System.out.println("Nome pai: " + nomePai + " - Idade: " + idadePai);
        System.out.println("Nome mãe: " + nomeMae + " - Idade: " + idadeMae);

    }
}
