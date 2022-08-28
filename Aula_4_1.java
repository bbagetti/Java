import Entidade.Usuario;

public class Aula_4_1 {
    public static void main(String[] args) {
        Usuario usuarioA = new Usuario("Bruno Bagetti", "096.846.074-74");
        Usuario usuarioB = new Usuario("Bárbara Lapa", "000.111.222-333");

        //Informações usuário A
//        usuarioA.setNome ("Bruno Bagetti");
//        usuarioA.setCpf ("096.846.074-74");
        usuarioA.setIdade (28);
        usuarioA.setGenero ("masculino");

        //Informações usuário B
//        usuarioB.setNome ("Bárbara Lapa");
//        usuarioB.setCpf ("000.000.000-00");
        usuarioB.setIdade (25);
        usuarioB.setGenero ("feminino");

        usuarioA.imprimirInformacoes();
        usuarioB.imprimirInformacoes();

        System.out.println("===============================================");
        usuarioA.realizarLancamento(300, "debito", "teste");

        usuarioB.realizarLancamento(300, "debito", "teste02");

        usuarioA.imprimirInformacoes();
        usuarioB.imprimirInformacoes();
    }
}
