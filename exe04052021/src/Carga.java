public class Carga {
    private long id;
    private String data;
    private Pacote pacote[];

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pacote[] getPacote() {
        return pacote;
    }

    public void setPacote(Pacote[] pacote) {
        this.pacote = pacote;
    }
}
