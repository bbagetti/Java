import java.util.Scanner;

public class Aula_2_3 {
    public static void main(String[] args) {
        Scanner scanTexto = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanTexto.nextLine();

        System.out.println("Digite sua idade:");
        String idade = scanTexto.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = scanTexto.nextLine();

        System.out.println("Digite seu gênero:");
        String genero = scanTexto.nextLine();

        System.out.println("Digite seu e-mail:");
        String email = scanTexto.nextLine();

        System.out.println("Digite seu telefone:");
        String telefone = scanTexto.nextLine();

        System.out.println("Digite seu endereço:");
        String rua = scanTexto.nextLine();

        System.out.println("Digite o nº:");
        String numero = scanTexto.nextLine();

        System.out.println("Digite seu bairro:");
        String bairro = scanTexto.nextLine();

        System.out.println("Digite sua cidade:");
        String cidade = scanTexto.nextLine();

        System.out.println("################## Formulário Moderna ##################");
        System.out.println("Nome: " + nome + " Idade: " + idade);
        System.out.println("CPF: " + cpf + " Gênero: " + genero);
        System.out.println("Email: " + email + " Tel: " + telefone);
        System.out.println("----------------------- Endereço -----------------------");
        System.out.println("Nº" + numero + " Rua: " + rua);
        System.out.println("Bairro: " + bairro + " Cidade: " + cidade);
        System.out.println("--------------------------------------------------------");


    }
}
