import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        //solicita informações ao usuário
        Scanner salarioMin = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        double salario = salarioMin.nextDouble();

        //equivalencia do salário em relação ao salário mínimo
        double calculoSM = salario / 1212;
        System.out.println("O seu salário equivale a " + calculoSM + " salário(s) mínimo(s)");
    }
}
