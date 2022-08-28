import Entidade.Aluno;
import Entidade.Endereco;

public class Aula_5_1 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bruno", "masculino");
        Endereco endereco1 = new Endereco("Rua Couto Magalhães", 559);

        aluno1.imprimirAluno();
        endereco1.imprimirEndereco();



    }
}
