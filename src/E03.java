import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner salarioMin = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        double salario = salarioMin.nextDouble();
        double calculoSM = salario / 1212;
        System.out.println("O seu salário equivale a " + calculoSM + " salário(s) mínimo(s)");
    }
}
