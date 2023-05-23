import java.util.Scanner;


public class E01 {
    public static void main(String[] args) {

        Scanner entradaDiaria = new Scanner(System.in);

        System.out.println("Digite o seu rendimento do dia em kg: ");
        double pesoDiario = entradaDiaria.nextDouble();

        if (pesoDiario > 50) {
            double excesso = pesoDiario - 50;
            System.out.println("O peso em excesso é igual a " + excesso + " kg");

            double multa = excesso * 4;
            System.out.println("Haverá multa no valor de " + multa + " reais");
        } else {
            System.out.println("Não haverá multa.");


        }
    }
}

