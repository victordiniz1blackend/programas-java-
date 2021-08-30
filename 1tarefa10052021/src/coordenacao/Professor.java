package coordenacao;

import secretaria.Pessoa;
import tcc.Orientacao;

public class Professor extends Pessoa {

    private long codigo;
    private String titulacao;
    private Orientacao orientacao[];

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Orientacao[] getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(Orientacao[] orientacao) {
        this.orientacao = orientacao;
    }
}
