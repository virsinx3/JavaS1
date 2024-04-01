public class Main {
    public static void main(String[] args) {
        double num1 = Calculadora.solicitarNumero("Digite o primeiro número");
        double num2 = Calculadora.solicitarNumero("Digite o segundo número");

        System.out.println("Adição: " + Calculadora.adicionar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
    }
}
