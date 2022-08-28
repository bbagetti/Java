package Entidade;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta (){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;

    }
}
