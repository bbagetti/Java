import Entidade.Cliente;

import java.util.Scanner;

public class Avaliacao_final {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Scanner scanNumero = new Scanner(System.in);
        Scanner scanTexto = new Scanner(System.in);

        int tipoHamburguer;
        int verdura;
        int molho;
        int queijo;
        String nome;

        System.out.println("--------- BEM-VINDO À HAMBURGUERIA MODERNA ---------");
        System.out.println("--------------- MONTE SEU HAMBURGUER ---------------");

        //escolher tipo carne
        System.out.println("TIPO DE HAMBURGUER:");
        System.out.println("(1) CARNE");
        System.out.println("(2) FRANGO");

        tipoHamburguer = scanNumero.nextInt();

        if(tipoHamburguer == 1){
            cliente1.setTipoHamburguer("CARNE");
            }else if(tipoHamburguer == 2){
            cliente1.setTipoHamburguer("FRANGO");
            }else{
            System.out.println("OPÇÃO INEXISTENTE");
        }

        //acrescentar verdura
        System.out.println("DESEJA ACRESCENTAR VERDURA?");
        System.out.println("(1) SIM");
        System.out.println("(2) NÃO");

        verdura = scanNumero.nextInt();

        if(verdura == 1){
            cliente1.setVerdura("SIM");
            }else if(verdura == 2){
            cliente1.setVerdura("NÃO");
            }else{
            System.out.println("OPÇÃO INEXISTENTE");
        }

        //acrescentar molho
        System.out.println("DESEJA ACRESCENTAR MOLHO?");
        System.out.println("(1) SIM");
        System.out.println("(2) NÃO");

        molho = scanNumero.nextInt();

        if(molho == 1){
            cliente1.setMolho("SIM");
            }else if(molho == 2){
            cliente1.setMolho("NÃO");
            }else{
            System.out.println("OPÇÃO INEXISTENTE");
        }

        //acrescentar queijo
        System.out.println("DESEJA ACRESCENTAR QUEIJO?");
        System.out.println("(1) SIM");
        System.out.println("(2) NÃO");

        queijo = scanNumero.nextInt();

        if(queijo == 1){
            cliente1.setQueijo("SIM");
            }else if(queijo == 2){
            cliente1.setQueijo("NÃO");
            }else{
            System.out.println("OPÇÃO INEXISTENTE");
        }

        //inserir nome cliente
        System.out.println("POR FAVOR, INSIRA SEU NOME:");
        cliente1.setNome(scanTexto.nextLine());

        cliente1.imprimirPedido();

    }
}
