import java.util.Scanner;


public class E01 {
    public static void main(String[] args) {
        //solicita informações ao usuário
        Scanner entradaDiaria = new Scanner(System.in);

        System.out.println("Digite o seu rendimento do dia em kg: ");
        double pesoDiario = entradaDiaria.nextDouble();

        //condição peso maior que 50
        if (pesoDiario > 50) {
            //calcula a diferença
            double excesso = pesoDiario - 50;
            System.out.println("O peso em excesso é igual a " + excesso + " kg");
            //calcula a multa
            double multa = excesso * 4;
            System.out.println("Haverá multa no valor de " + multa + " reais");
        //condição peso menor que 50
        } else {
            System.out.println("Não haverá multa.");
        }
    }
}

