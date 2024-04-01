public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123456, "José", 1000.0);

        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(2000.0); 

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
