public class Profissao {
    private String nomeprofissao;
    private Empresa empresa;
    private Pessoa pessoa[];

    public String getNomeprofissao() {
        return nomeprofissao;
    }

    public void setNomeprofissao(String nomeprofissao) {
        this.nomeprofissao = nomeprofissao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Pessoa[] getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa[] pessoa) {
        this.pessoa = pessoa;
    }
}
