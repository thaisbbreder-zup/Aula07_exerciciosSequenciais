import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner calculoImc = new Scanner(System.in);
        System.out.println("Digite seu peso em kg");
        double peso = calculoImc.nextDouble();

        System.out.println("Digite sua altura");
        double altura = calculoImc.nextDouble();

        double resultadoImc = peso / (altura * altura);
        System.out.printf("O seu IMC é " + resultadoImc + ", equivalente a classificação de " );

        if (resultadoImc < 18.5) {
            System.out.printf("Abaixo do peso. Procure um médico!");
        } else if
        (resultadoImc >= 18.5 && resultadoImc <= 24.9) {
            System.out.printf("Peso normal. Que ótimo! =)");
        } else if
        (resultadoImc >= 25.0 && resultadoImc <= 29.9) {
            System.out.printf("Sobrepeso. Fique atento e procure um médico!");
        } else if (resultadoImc >= 30.0) {
            System.out.printf("Obesidade. Procure um médico!");
        }
    }
}
