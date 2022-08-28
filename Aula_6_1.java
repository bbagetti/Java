import Entidade.Conta;
import Entidade.ContaAposentadoria;
import Entidade.ContaInvestimento;

public class Aula_6_1 {
    public static void main(String[] args) {
        Conta conta = new Conta(12345, 200);
        ContaInvestimento ci = new ContaInvestimento();
        ContaAposentadoria ca = new ContaAposentadoria();

        ci.setTaxa(5);
        ci.setSaldo(200);
        ci.setNumero(321);
        ci.sacar(100);

        System.out.println("CI: " + ci.getSaldo());

        ca.setRendimento(5);
        ca.setSaldo(200);
        ca.setNumero(555);
        ca.depositar(100);

        System.out.println("CA: " + ca.getSaldo());

        Conta teste = ci;
        ci.sacar(10);

        System.out.println("Teste: " + teste.getSaldo());

    }
}
