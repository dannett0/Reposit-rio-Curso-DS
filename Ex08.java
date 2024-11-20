package exercicios;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        int totalmes = questionarioReferenteAoSalario();
        System.out.println("Seu salário total no mês é: " + totalmes);
    }
    public static int questionarioReferenteAoSalario(){
          Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de ganho por hora ");
        int ganhoporhora = input.nextInt();
        System.out.println("Digite o número de horas trabalhadas por mês ");
        int horastrabalhadaspordia = input.nextInt();
        input.close();
        int totalmes = calculadorDoSalario(ganhoporhora, horastrabalhadaspordia);
        return totalmes;

    }
        public static int calculadorDoSalario(int ganhoporhora,int horastrabalhadaspordia){
           
            int totalmes = ganhoporhora * horastrabalhadaspordia;

          return totalmes;  
        }
}
