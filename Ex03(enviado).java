import java.util.Scanner;

/**
 * 3. Escreva um algorítimo que receba um valor de entrada do usuário, 
 * e faça com que o programa mostre ao usuário se esse número é par ou 
 * ímpar.
 */
public class Ex03 {
    public static void main(String[] args) {
        int num = entradaDeDados();
        comparaValores(num);
    }

    public static int entradaDeDados() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um valor de entrada: ");
        int num = input.nextInt();
        input.close();
        return num;
    }

    public static void comparaValores(int num) {
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }
}
