package Entidade;

public class Programador extends Pessoa {
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
