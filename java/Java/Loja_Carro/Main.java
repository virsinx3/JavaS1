public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Volkswagen", "Gol", 2022, "ABC1234");
        meuCarro.exibirInformacoes();
        meuCarro.acelerar();
        meuCarro.acelerar();
        System.out.println("\nApós acelerar:");
        meuCarro.exibirInformacoes();
        meuCarro.frear();
        System.out.println("\nApós frear:");
        meuCarro.exibirInformacoes();
    }
}
