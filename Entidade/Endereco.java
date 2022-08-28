package Entidade;

public class Endereco {
    private int numero;
    private String rua;
    private String complemento;
    private String cep;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco(){}

    public Endereco(String rua, int numero){
        this.rua = rua;
        this.numero = numero;
    }

    public void imprimirEndereco(){
        System.out.println("############# ENDEREÇO #############");
        System.out.println("Rua: " + this.rua + " Número: " + this.numero);
        System.out.println("Complemento: " + this.complemento + " CEP: " + this.cep);
}}
