package Entidade;

public class Aluno {
    private String nome;
    private String genero;
    private int idade;
    private String telefone;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno(){}

    public Aluno(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
    public void imprimirAluno(){
        System.out.println("############# ALUNO #############");
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade + " Gênero: " + this.genero);
        System.out.println("Endereço: " + this.endereco + " Telefone: " + this.telefone);



    }
}
