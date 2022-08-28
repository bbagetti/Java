import Entidade.Cadastro;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Cadastro usuario1 = new Cadastro();
        Cadastro usuario2 = new Cadastro();
        Scanner scanTexto = new Scanner(System.in);
        Scanner scanNumero = new Scanner(System.in);

        System.out.println("######## USUÁRIO 1 ########");
        System.out.println("Digite seu nome:");
        usuario1.nome = scanTexto.nextLine();
        System.out.println("Digite sua idade:");
        usuario1.idade = scanNumero.nextInt();
        System.out.println("Digite seu gênero:");
        usuario1.genero = scanTexto.nextLine();
        System.out.println("Digite seu CPF:");
        usuario1.cpf = scanTexto.nextLine();
        System.out.println("Digite seu salário:");
        usuario1.salario = scanNumero.nextDouble();

        System.out.println("######## USUÁRIO 2 ########");
        System.out.println("Digite seu nome:");
        usuario2.nome = scanTexto.nextLine();
        System.out.println("Digite sua idade:");
        usuario2.idade = scanNumero.nextInt();
        System.out.println("Digite seu gênero:");
        usuario2.genero = scanTexto.nextLine();
        System.out.println("Digite seu CPF:");
        usuario2.cpf = scanTexto.nextLine();
        System.out.println("Digite seu salário:");
        usuario2.salario = scanNumero.nextDouble();

        usuario1.imprimirInfo();
        usuario2.imprimirInfo();

    }
}
