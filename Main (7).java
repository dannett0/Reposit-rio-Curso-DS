package objetos;

public class Main {
    
    public static void main(String[] args) {
        
        Caneta caneta1 = new Caneta("Azul", "Branco", false);

        System.out.println(caneta1);

        Livro livro1 = new Livro("Pedro Bandeira", "Moderna", true);

        System.out.println(livro1);

        Celular celular = new Celular("Samsung", "A23", "2020", "Azul");

        System.out.println(celular);
    }
}

