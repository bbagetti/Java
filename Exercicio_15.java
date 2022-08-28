import Entidade.Aluno;
import Entidade.Endereco;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner scanTexto = new Scanner(System.in);
        Scanner scanNumero = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Endereco endereco1 = new Endereco();

        System.out.println("---------- MENU ----------");
        System.out.println("ESCOLHA UMA DAS OPÇÕES:");
        System.out.println("(1) CADASTRO ALUNO");
        System.out.println("(2) CADASTRO ENDEREÇO");
        System.out.println("(3) VINCULAR ENDEREÇO AO ALUNO");
        System.out.println("(4) IMPRIMIR");
        System.out.println("(5) SAIR");

        int opcao1 = scanNumero.nextInt();

        //FALTA ACERTAR WHILE
        while (opcao1 >= 6){
            System.out.println("---------- MENU ----------");
            System.out.println("ESCOLHA UMA DAS OPÇÕES:");
            System.out.println("(1) CADASTRO ALUNO");
            System.out.println("(2) CADASTRO ENDEREÇO");
            System.out.println("(3) VINCULAR ENDEREÇO AO ALUNO");
            System.out.println("(4) IMPRIMIR");
            System.out.println("(5) SAIR");

        }
        switch (opcao1){
            case (1):
                System.out.println("---------- CADASTRO ALUNO ----------");
                System.out.println("Digite o nome:");
                aluno1.setNome (scanTexto.nextLine());
                System.out.println("Digite a idade:");
                aluno1.setIdade (scanNumero.nextInt());
                System.out.println("Digite o gênero:");
                aluno1.setGenero (scanTexto.nextLine());
                System.out.println("Digite o telefone:");
                aluno1.setTelefone (scanTexto.nextLine());
                System.out.println("Digite o endereço:");
                aluno1.setEndereco (scanTexto.nextLine());

                System.out.println("---------- MENU ----------");
                System.out.println("ESCOLHA UMA DAS OPÇÕES:");
                System.out.println("(4) IMPRIMIR");
                System.out.println("(5) SAIR");

                int opcao2 = scanNumero.nextInt();

                switch (opcao2){
                    case (4):
                        aluno1.imprimirAluno();
                        break;
                    case (5):
                        System.out.println("SAINDO...");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;

            case (2):
                System.out.println("---------- CADASTRO ENDEREÇO ----------");
                System.out.println("Digite a rua:");
                endereco1.setRua (scanTexto.nextLine());
                System.out.println("Digite o número:");
                endereco1.setNumero (scanNumero.nextInt());
                System.out.println("Digite o complemento:");
                endereco1.setComplemento (scanTexto.nextLine());
                System.out.println("Digite o CEP:");
                endereco1.setCep (scanTexto.nextLine());

                System.out.println("---------- MENU ----------");
                System.out.println("ESCOLHA UMA DAS OPÇÕES:");
                System.out.println("(4) IMPRIMIR");
                System.out.println("(5) SAIR");

                int opcao3 = scanNumero.nextInt();

                switch (opcao3){
                    case (4):
                        endereco1.imprimirEndereco();
                        break;
                    case (5):
                        System.out.println("SAINDO...");
                        break;
                    default:
                        System.out.println("ERRO");
                }
                break;

            case (5):
                System.out.println("SAINDO...");
                break;

        }


    }
}
