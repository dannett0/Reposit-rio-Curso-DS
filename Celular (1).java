package objetos;

public class Celular {

    private String marca;
    private String modelo;
    private String ano;
    private String cor;

    

    public String getMarca() {
        return marca;
    }

    public Celular(String marca, String modelo, String ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void conversar() {
        System.out.println("Estou conversando");
    }

    public void assistir() {
        System.out.println("Estou assistindo uma série");
    }

    @Override
    public String toString() {
        return "\nInformações do Celular: "
                + "\n\tMarca: " + this.marca
                + "\n\tModelo: " + this.modelo
                + "\n\tAno: " + this.ano
                + "\n\tcor: " + this.cor;
    }

}
