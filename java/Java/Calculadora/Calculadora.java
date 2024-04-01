import java.util.Scanner;

public class Calculadora {
    private static Scanner scanner = new Scanner(System.in);

    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão dará erro!");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static double solicitarNumero(String mensagem) {
        System.out.print(mensagem + ": ");
        return scanner.nextDouble();
    }
}
