package Entidade;

public class ContaAposentadoria extends Conta{
    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor + this.rendimento));
    }
}
