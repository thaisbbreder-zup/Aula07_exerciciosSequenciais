import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner calculoImc  = new Scanner(System.in);
        System.out.println("Digite seu peso em kg");
        double peso = calculoImc.nextDouble();

        System.out.println("Digite sua altura");
        double altura = calculoImc.nextDouble();

        double resultadoImc = peso / (altura * altura);
        System.out.println("O seu IMC é " + resultadoImc);
    }
}
