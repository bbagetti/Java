import java.util.Scanner;

public class Exercício_12 {
    public static void main(String[] args) {
        Scanner scanNumero = new Scanner(System.in);
        Scanner scanTexto = new Scanner(System.in);
        //Variaveis Menu
        int opcao = 0;
        //Variaveis Aluno
        int idade = 0;
        int anoNasc = 0;
        String nome = "";
        String sexo = "";
        //Variaveis Enderco
        int numero = 0;
        String rua = "";
        String bairro = "";
        String cep = "";

        while (opcao != 5) {
            System.out.println("====== OPÇÔES =====");
            System.out.println("(1)Cadastro Aluno");
            System.out.println("(2)Cadastro Endereço");
            System.out.println("(3)Imprimir Aluno");
            System.out.println("(4)Imprimir Endereço");
            System.out.println("(5)Sair");
            opcao = scanNumero.nextInt();

            switch (opcao) {
                case (1):
                    System.out.println("==== Aluno ====");
                    System.out.println("Nome:");
                    nome = scanTexto.nextLine();
                    break;
                case (2):

                    break;
                case (3):
                    System.out.println("==== Imprimir Aluno ====");
                    System.out.println("Nome:" + nome + " Idade: " + idade);
                    break;
                case (4):

                    break;
                case (5):
                    System.out.println("Sair fui");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }
    }
}
