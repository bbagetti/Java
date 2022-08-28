import Entidade.Usuario_conta;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner scanTexto = new Scanner(System.in);
        Scanner scanNumero = new Scanner(System.in);
        Usuario_conta usuario1 = new Usuario_conta();

        usuario1.nome = "Bruno Tarso Pinheiro Bagetti da Fonseca";
        usuario1.cpf = "096.846.074-74";
        usuario1.saldoConta = 1000;

        usuario1.imprimpirUsuario();

        System.out.println("ESCOLHA A OPERAÇÃO DESEJADA:");
        System.out.println("(1) CRÉDITO");
        System.out.println("(2) DÉBITO");
        usuario1.tipoLancamento = scanNumero.nextInt();

        System.out.println("DIGITE O VALOR DO LANÇAMENTO:");
        usuario1.valorLancamento = scanNumero.nextDouble();

        System.out.println("DIGITE A DESCRIÇÃO DO LANÇAMENTO:");
        usuario1.descricaoLancamento = scanTexto.nextLine();

        usuario1.realizarLancamento();
        usuario1.novoSaldo();

        System.out.println("DESEJA REALIZAR NOVO LANÇAMENTO?");
        System.out.println("(1) SIM");
        System.out.println("(2) NÃO");
        int opcao2 = scanNumero.nextInt();

        if(opcao2 == 1){
            System.out.println("ESCOLHA A OPERAÇÃO DESEJADA:");
            System.out.println("(1) CRÉDITO");
            System.out.println("(2) DÉBITO");
            usuario1.tipoLancamento2 = scanNumero.nextInt();

            System.out.println("DIGITE O VALOR DO LANÇAMENTO:");
            usuario1.valorLancamento2 = scanNumero.nextDouble();

            System.out.println("DIGITE A DESCRIÇÃO DO LANÇAMENTO:");
            usuario1.descricaoLancamento2 = scanTexto.nextLine();
            usuario1.realizarLancamento2();
            usuario1.novoSaldo2();
        }else if(opcao2 == 2){
            System.out.println("FIM");
        }else{
            System.out.println("ERRO");
        }
    }
}

