package objetos;

public class Caneta {
    
    private String cor;
    private String corTinta;
    private boolean tampa = true;

    public Caneta(String cor, String corTinta, boolean tampa) {
        this.cor = cor;
        this.corTinta = corTinta;
        this.tampa = tampa;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCorTinta() {
        return corTinta;
    }

    public void setCorTinta(String corTinta) {
        this.corTinta = corTinta;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    @Override
    public String toString() {
        return "\nCor: " + this.cor
                + "\nCor da tinta: " + this.corTinta
                + "\nTampa: " + this.tampa;
    }
}
