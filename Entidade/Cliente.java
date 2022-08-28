package Entidade;

public class Cliente {
    private String nome;
    private String tipoHamburguer;
    private String verdura;
    private String molho;
    private String queijo;

    //construtor implícito - explícito
    public Cliente (){}

    public Cliente (String nome, String verdura, String molho, String queijo){
        this.nome = nome;
        this.verdura = verdura;
        this.molho = molho;
        this.queijo = queijo;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoHamburguer() {
        return tipoHamburguer;
    }

    public void setTipoHamburguer(String tipoHamburguer) {
        this.tipoHamburguer = tipoHamburguer;
    }

    public String getVerdura() {
        return verdura;
    }

    public void setVerdura(String verdura) {
        this.verdura = verdura;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void imprimirPedido(){
        System.out.println("------------ PEDIDO Nº ### ------------");
        System.out.println("NOME CLIENTE: " + this.nome);
        System.out.println("TIPO HAMBURGUER: " + this.tipoHamburguer);
        System.out.println("ACRESCENTAR VERDURA: " + this.verdura);
        System.out.println("ACRESCENTAR MOLHO: " + this.molho);
        System.out.println("ACRESCENTAR QUEIJO: " + this.queijo);
    }

}


