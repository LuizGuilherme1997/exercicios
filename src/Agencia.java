/**
 * Created by lggui on 30/07/2017.
 */
public class Agencia {
    private String nome;
    private int codigo;

    public  Agencia (int codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
