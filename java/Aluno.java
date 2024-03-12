import java.util.Scanner;

public class Aluno {
    String matricula;
    String nome;
    float nota1, nota2, media;
    boolean aprovado;

    Aluno(String mat, String nom, float n1, float n2) {

        matricula = mat;
        nome = nom;
        nota1 = n1;
        nota2 = n2;

    }

    void calcularMedia() {
        media = (nota1 + nota2) / 2;
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média do aluno" + nome + "é :" + nota1);
    }

    /*
     * //
     * public Aluno(String nome, int matricula, float n1, float n2) {
     * this.nome = nome;
     * this.matricula = matricula;
     * this.n1 = n1;
     * this.n2 = n2;
     * }
     * 
     * public int callterminal(int term) {
     * 
     * Scanner leitor = new Scanner(System.in);
     * System.out.println("~Seja bem vindo ao terminal~");
     * System.out.println("~Digite o número indicado para selecionar~");
     * System.out.println("2-Deseja Cadastrar um aluno?");
     * System.out.println("1-Deseja Consultar as notas de algum aluno?");
     * System.out.println("0-Sair");
     * term = leitor.nextInt();
     * return term;
     * }
     * 
     * public float media() {
     * return (n1 + n2) / 2;
     * }
     * 
     * public void exibir() {
     * System.out.println("Nome:" + nome);
     * System.out.println("Matrícula:" + matricula);
     * System.out.println("Nota 1:" + n1);
     * System.out.println("Nota 2:" + n2);
     * System.out.println("A média é:" + media());
     * }
     */

}
