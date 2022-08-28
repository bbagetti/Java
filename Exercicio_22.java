import Entidade.Pessoa;
import Entidade.PessoaFisica;
import Entidade.PessoaJuridica;
import Entidade.Programador;

public class Exercicio_22 {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj  = new PessoaJuridica();
        Programador pr = new Programador();

        pf.setEstadoCivil("Casado");
        pf.setTelefone("88990099");
        System.out.println(pf.toString());

        pj.setCnpj("233.4456-5567");
        pj.setNomeFantasia("Moderna");
        System.out.println(pj.toString());

        pr.setCargo("Programador");
        pr.setSalario(1500);
        System.out.println(pr.toString());

        Pessoa pp = pr;
        System.out.println(pp.toString());

    }
}
