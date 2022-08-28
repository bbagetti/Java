import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanNumero = new Scanner(System.in);
        Scanner scanTexto = new Scanner(System.in);
        //Variaveis Menu
        int opcao = 0;
        //Variaveis Aluno
        int idade, anoNasc;
        String nome, sexo;
        //Variaveis Enderco
        int numero;
        String rua, bairro, cep;

        System.out.println("Escolha uma opção:");
        System.out.println("(1)Cadatro Aluno");
        System.out.println("(2)Cadatro Endereço");
        System.out.println("(5)Sair");
        opcao = scanNumero.nextInt();

        //Logica do switch
        switch (opcao){
            case(1):
                System.out.println("== Cadastro Aluno ==");
                System.out.println("Nome: ");
                nome = scanTexto.nextLine();

                System.out.println("Qual opção: ");
                System.out.println("(3)Imprimir Aluno");
                System.out.println("(5)Sair");
                opcao = scanNumero.nextInt();

                if(opcao == 3){
                    System.out.println("======= Aluno ======");
                    System.out.println("Nome: " + nome);
                }
                if(opcao == 5){
                    System.out.println("Saindo fui");
                }
                break;
            case(2):
                System.out.println("== Cadastro Endereço ==");
                System.out.println("Rua: ");
                rua = scanTexto.nextLine();

                System.out.println("Qual opção: ");
                System.out.println("(4)Imprimir Endereço");
                System.out.println("(5)Sair");
                opcao = scanNumero.nextInt();
                if(opcao == 4){
                    System.out.println("======= Endereço ======");
                    System.out.println("Rua: " + rua);
                }
                if(opcao == 5){
                    System.out.println("Saindo fui");
                }
                break;
            case(5):
                System.out.println("Sair");
                break;
        }


    }
}
