/**
 * Created by lggui on 30/07/2017.
 */
public class Conta {
    private Double saldo;
    private Agencia agencia;

    public Conta(Agencia agencia){
        this.saldo = 100.00;
        this.agencia = agencia;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void depositar(Double quantidade){
        if(quantidade < 0) {
            System.out.println("Depósito Inválido");
        }else{
            this.saldo+=quantidade;
        }
    }
    public void sacar(Double quantidade){
        if(this.saldo-quantidade<0 || quantidade == 0){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo-=quantidade;
        }
    }
    public void imprimirExtrato(){
        System.out.println(this.saldo);
    }

    public void transferirValor(Conta contaDestino,Double valor){
        this.saldo-=valor;
        contaDestino.saldo+=valor;
    }
}

