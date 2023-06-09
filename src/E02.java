import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        //solicita informações ao usuário
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite seu peso em kg");
        double peso = entradaDoUsuario.nextDouble();

        System.out.println("Digite sua altura");
        double altura = entradaDoUsuario.nextDouble();

        //calcula o IMC e informa a classificação de acordo com as condições abaixo
        double resultadoImc = peso / (altura * altura);
        System.out.printf("O seu IMC é " + resultadoImc + ", equivalente a classificação de ");

        //condições
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
