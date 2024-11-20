package exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int resultado = coletorDeInformações();
        System.out.println("Resultado final " + resultado);
    }

    public static int coletorDeInformações() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os anos: ");
        int anos = input.nextInt();
        System.out.println("Insira os meses: ");
        int meses = input.nextInt();
        System.out.println("Insira os dias: ");
        int dias = input.nextInt();
        input.close();

        int resultado = conversorDeIdade(anos, meses, dias);
        return resultado;
    }

    public static int conversorDeIdade(int anos, int meses, int dias) {
        int resultado;
        resultado = (anos * 365) + (meses * 30) + dias;     
        return resultado;   
    }
}