import java.sql.SQLOutput;
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = entradaDoUsuario.nextInt();

        int meses = idade * 12;
        int dias = idade * 365;

        System.out.println("A sua idade equivale a " + idade + " anos");
        System.out.println("A sua idade equivale a " + meses + " meses");
        System.out.println("A sua idade equivale a " + dias + " dias");
    }
}
