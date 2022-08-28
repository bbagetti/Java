import java.util.Scanner;

public class Exercício_8_outra_forma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int vme, vma, e1, e2, e3, e4, e5;

        //Iniciar lógica
        System.out.println("Informe um valor:");
        e1 = scan.nextInt();

        vme = e1;
        vma = e1;

        //Segunda entrada
        System.out.println("Informe um novo número:");
        e2 = scan.nextInt();
        //Terceira entrada
        System.out.println("Informe um novo número:");
        e3 = scan.nextInt();
        //Quartaa entrada
        System.out.println("Informe um novo número:");
        e4 = scan.nextInt();
        //Quinta entrada
        System.out.println("Informe um novo número:");
        e5 = scan.nextInt();

        //Lógica de manior e menor
        if(e2 > vma){
            vma = e2;
        }
        if(e3 > vma){
            vma = e3;
        }
        if(e4 > vma){
            vma = e4;
        }
        if(e5 > vma){
            vma = e5;
        }
        if(e2 < vme){
            vme = e2;
        }
        if(e3 < vme){
            vme = e3;
        }
        if(e4 < vme){
            vme = e4;
        }
        if(e5 < vme){
            vme = e5;
        }
        //Final
        System.out.println("Valor maior: " + vma);
        System.out.println("Valor menor: " + vme);
    }
}
