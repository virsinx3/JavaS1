import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String matricula;
    private String nome;
    private double[] notas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = new double[5];
    }

    public void setNota(int x, double nota) {
        this.notas[x] = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double calcularNotaFinal() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus() {
        double notaFinal = calcularNotaFinal();
        return notaFinal >= 6 ? "Aprovado" : "Reprovado";
    }
}

public class teste2 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a matrícula do aluno:");
            String matricula = leitor.next();
            System.out.println("Digite o nome do aluno:");
            String nome = leitor.next();

            Aluno aluno = new Aluno(matricula, nome);

            for (int j = 0; j < 5; j++) {
                System.out.println("Digite a nota " + (j + 1) + ":");
                double nota = leitor.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Você digitou uma nota inválida, recomece.");
                    j--;
                    continue;
                }

                aluno.setNota(j, nota);
            }

            alunos.add(aluno);
        }

        System.out.println("Resultados:");
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota Final: " + aluno.calcularNotaFinal());
            System.out.println("Status: " + aluno.getStatus());
            System.out.println();
        }
    }
}