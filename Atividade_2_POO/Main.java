package Atividade_2_POO;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int escolha = 10;

        while (escolha != 0) {
            System.out.println("---------- Menu ----------\n" +
                    "0 - Encerrar programa\n" +
                    "1 - Cadastrar um aluno\n" +
                    "2 - Verificar os alunos\n" +
                    "3 - Cadastrar nota de aluno\n" +
                    "4 - Ver a nota de um aluno\n" +
                    "5 - Cadastrar um professor\n" +
                    "6 - Alocar professor em uma disciplina\n" +
                    "7 - Verificar os professores\n");
            escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando.");
                    input.close();
                    break;

                case 1:
                    Aluno aluno = new Aluno();
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setName(input.next());
                    System.out.println("Digite a idade do aluno: ");
                    aluno.setIdade(input.nextInt());
                    System.out.println("Digite o CPF do aluno: ");
                    aluno.setCPF(input.next());
                    System.out.println("Digite o curso do aluno: ");
                    aluno.setCurso(input.next());
                    System.out.println("Digite o número da matrícula: ");
                    aluno.setMatricula(input.nextInt());
                    alunos.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso!\n");
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.\n");
                    } else {
                        System.out.println("Alunos cadastrados:");
                        for (Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o número da matrícula do aluno: ");
                    int matricula = input.nextInt();
                    Aluno alunoEncontrado = null;
                    for (Aluno a : alunos) {
                        if (a.getMatricula() == matricula) {
                            alunoEncontrado = a;
                            break;
                        }
                    }
                    if (alunoEncontrado != null) {
                        System.out.println("Digite a nota do aluno: ");
                        double nota = input.nextDouble();
                        alunoEncontrado.setNota(nota);
                        System.out.println("Nota cadastrada com sucesso!\n");
                    } else {
                        System.out.println("Aluno não encontrado.\n");
                    }
                    break;

                case 4:
                    System.out.println("Digite o número da matrícula do aluno: ");
                    matricula = input.nextInt();
                    alunoEncontrado = null;
                    for (Aluno a : alunos) {
                        if (a.getMatricula() == matricula) {
                            alunoEncontrado = a;
                            break;
                        }
                    }
                    if (alunoEncontrado != null) {
                        System.out.println("A nota do aluno " + alunoEncontrado.getName() + " é: " + alunoEncontrado.getNota() + "\n");
                    } else {
                        System.out.println("Aluno não encontrado.\n");
                    }
                    break;

                case 5:
                    Professor professor = new Professor();
                    System.out.println("Digite o nome do professor: ");
                    professor.setName(input.next());
                    System.out.println("Digite a idade do professor: ");
                    professor.setIdade(input.nextInt());
                    System.out.println("Digite o CPF do professor: ");
                    professor.setCPF(input.next());
                    System.out.println("Digite o número da matrícula do professor: ");
                    professor.setMatricula(input.nextInt());
                    professores.add(professor);
                    System.out.println("Professor cadastrado com sucesso!\n");
                    break;

                case 6:
                    System.out.println("Digite o número da matrícula do professor: ");
                    matricula = input.nextInt();
                    Professor professorEncontrado = null;
                    for (Professor p : professores) {
                        if (p.getMatricula() == matricula) {
                            professorEncontrado = p;
                            break;
                        }
                    }
                    if (professorEncontrado != null) {
                        System.out.println("Digite a disciplina que o professor irá lecionar: ");
                        String disciplina = input.next();
                        professorEncontrado.setDiscplinas(disciplina);
                        System.out.println("Professor alocado na disciplina " + disciplina + " com sucesso!\n");
                    } else {
                        System.out.println("Professor não encontrado.\n");
                    }
                    break;

                case 7:
                    if (professores.isEmpty()) {
                        System.out.println("Nenhum professor cadastrado.\n");
                    } else {
                        System.out.println("Professores cadastrados:");
                        for (Professor p : professores) {
                            System.out.println(p);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }
        }
    }
}
