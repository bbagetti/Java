package Entidade;

public class Usuario_conta {
    public String nome;
    public String cpf;
    public double saldoConta;
    public int tipoLancamento;
    public double valorLancamento;
    public String descricaoLancamento;
    public double novoSaldo;
    public int tipoLancamento2;
    public double valorLancamento2;
    public String descricaoLancamento2;
    public double novoSaldo2;

    public void imprimpirUsuario(){
            System.out.println("############## BEM VINDO AO NUBANK ##############");
            System.out.println("-------------------- USUÁRIO --------------------");
            System.out.println("NOME: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("SALDO: R$ " + this.saldoConta);
            System.out.println("-------------------------------------------------");
    }
    public void realizarLancamento() {
        if(this.tipoLancamento == 1){
            this.novoSaldo = (this.saldoConta + this.valorLancamento);
        }else if(this.tipoLancamento == 2){
            this.novoSaldo = (this.saldoConta - this.valorLancamento);
        }else{
            System.out.println("ERRO");
        }
    }

    public void novoSaldo(){
        System.out.println("-------------------- USUÁRIO --------------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("VALOR DO LANÇAMENTO: " + this.valorLancamento);
        System.out.println("DESCRIÇÃO DO LANÇAMENTO: " + this.descricaoLancamento);
        System.out.println("NOVO SALDO: R$ " + this.novoSaldo);
        System.out.println("-------------------------------------------------");
    }

    public void realizarLancamento2(){
        if(this.tipoLancamento2 == 1){
            this.novoSaldo2 = (this.novoSaldo + this.valorLancamento2);
        }else if(this.tipoLancamento2 == 2){
            this.novoSaldo2 = (this.novoSaldo - this.valorLancamento2);
        }else{
            System.out.println("ERRO");
        }
    }

    public void novoSaldo2(){
        System.out.println("-------------------- USUÁRIO --------------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("VALOR DO LANÇAMENTO: " + this.valorLancamento2);
        System.out.println("DESCRIÇÃO DO LANÇAMENTO: " + this.descricaoLancamento2);
        System.out.println("NOVO SALDO: R$ " + this.novoSaldo2);
        System.out.println("-------------------------------------------------");
    }
}

