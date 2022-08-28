import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner scanNumero = new Scanner(System.in);
        Scanner scanTexto = new Scanner(System.in);
        int qtd, contador;
        String nome;

        System.out.println("Informe seu nome: ");
        nome = scanTexto.nextLine();
        System.out.println("Informe a quantidade: ");
        qtd = scanNumero.nextInt();

        //Logica while
        contador = 1;
        while (contador <= qtd){
            System.out.println(contador + " - " + nome);
//            contador = contador + 1;
            contador++;
        }

    }
}
