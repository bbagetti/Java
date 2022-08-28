package Entidade;

public class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Usuario(){}

    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método utilizado para imprimir as informações
     * do usuário
     */
    public void imprimirInformacoes(){
        System.out.println("--------------- Usuário ---------------");
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade + " Gênero: " + this.genero);
        System.out.println("CPF: " + this.cpf + " Salário: R$ " + this.salario);
    }

    /**
     * Método utilizado para realizar lançamento do tipo Crédito ou Débito
     * @param valor
     * @param tipoLancamento
     * @param descricao
     */
    public void realizarLancamento(double valor, String tipoLancamento, String descricao){
        if (tipoLancamento.equalsIgnoreCase("credito")){
            this.salario += valor;
        }else if(tipoLancamento.equalsIgnoreCase("debito")) {
            this.salario -= valor;
        }else{
            System.out.println("Opção inválida");
        }


}}
