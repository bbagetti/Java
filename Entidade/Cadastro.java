package Entidade;

public class Cadastro {
    public String nome;
    public String cpf;
    public int idade;
    public double salario;
    public String genero;

    public void imprimirInfo(){
        System.out.println("----------------------- Usuário -----------------------");
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade + " Gênero: " + this.genero);
        System.out.println("CPF: " + this.cpf + " Salário: " + this.salario);
    }


}
