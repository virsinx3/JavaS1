import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula6 {
    public static void main(String[] args) {
        List<String[]> alunos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a matrícula do aluno:");
            String matricula = leitor.next();
            System.out.println("Digite o nome do aluno:");
            String nome = leitor.next();
            System.out.println("Digite a primeira nota:");
            double nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota:");
            double nota2 = leitor.nextDouble();
            System.out.println("Digite a terceira nota:");
            double nota3 = leitor.nextDouble();
            System.out.println("Digite a quarta nota:");
            double nota4 = leitor.nextDouble();
            System.out.println("Digite a quinta nota:");
            double nota5 = leitor.nextDouble();

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10 || nota5 < 0 || nota5 > 10) {
                System.out.println("Você digitou uma nota inválida, recomece.");
                i--; // Volta uma iteração para digitar novamente as informações do aluno.
                continue;
            }

            double notaFinal = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
            String status = notaFinal >= 6 ? "Aprovado" : "Reprovado";

            String[] aluno = {matricula, nome, Double.toString(notaFinal), status};
            alunos.add(aluno);
        }

        System.out.println("Resultados:");
        for (String[] aluno : alunos) {
            System.out.println("Matrícula: " + aluno[0]);
            System.out.println("Nome: " + aluno[1]);
            System.out.println("Nota Final: " + aluno[2]);
            System.out.println("Status: " + aluno[3]);
            System.out.println();
        }
    }
}