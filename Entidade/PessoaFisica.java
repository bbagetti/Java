package Entidade;

public class PessoaFisica extends Pessoa {
    private String estadoCivil;
    private String telefone;

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "estadoCivil='" + estadoCivil + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
