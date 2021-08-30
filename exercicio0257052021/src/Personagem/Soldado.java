package Personagem;

public  class Soldado extends Bot {
    private String tropa;

    public String getTropa() {
        return tropa;
    }

    public void setTropa(String tropa) {
        this.tropa = tropa;
    }

    @Override
    public double calculaVida() {
        return getSaude() +0.12/getForca();
    }
}
