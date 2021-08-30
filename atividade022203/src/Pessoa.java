public class Pessoa {

    private String nome;
    private Data data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getidade(int anoatual){

        return anoatual - data.getAno();
    }


}
