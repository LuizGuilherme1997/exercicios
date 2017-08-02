/**
 * Created by lggui on 30/07/2017.
 */
public class Fatura {
    private Double valorFatura;
    private String dataExpixacao;


    public Fatura(){
        this.valorFatura = 0.0;
    }

    public Double getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(Double valorFatura) {
        this.valorFatura = valorFatura;
    }

    public String getDataExpixacao() {
        return dataExpixacao;
    }

 public void setDataExpixacao(String dataExpixacao) {
        this.dataExpixacao = dataExpixacao;
    }

 public void adicionarValor(Double quantidade){
        this.valorFatura+=quantidade;
 }
 public Double calcularMulta(){
     return this.valorFatura * 0.2;
 }
 public void imprimirFatura() {
    System.out.println(this.valorFatura);
 }

}
