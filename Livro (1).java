package objetos;

public class Livro {

    private String autor;
    private String editora;
    private boolean capaDura = true;

 

    public Livro(String autor, String editora, boolean capaDura) {
        this.autor = autor;
        this.editora = editora;
        this.capaDura = capaDura;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean iscapaDura() {
        return capaDura;
    }

    public void setcapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    public void ler() {
        System.out.println("Estou lendo");
    }

    public void interpretar() {
        System.out.println("Estou interpretando");
    }

    @Override
    public String toString() {
        return "\nAutor: " + this.autor
                + "\nEditora: " + this.editora
                + "\nCapa: " + this.capaDura;
    }
}
