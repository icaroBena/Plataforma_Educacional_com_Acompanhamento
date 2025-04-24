import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // To usando isso pra criar professores
        Professor prof1 = new Professor("Fabio Silva", "Inteligência Artificial", "Prof001");
        Professor prof2 = new Professor("João Grilo", "Estrutura de Dados", "Prof002");

        // pra criar os cursos
        Curso curso1 = new Curso("Projeto de Programa", 60, "Conceitos básicos em Java", prof1);
        Curso curso2 = new Curso("Arquitetura e Estrutura de Dados", 80, "Listas, Pilhas, Filas", prof2);

        // criar as turmas
        Turma turma1 = new Turma("T001", "2024.1", curso1);
        Turma turma2 = new Turma("T002", "2024.1", curso2);
        curso1.adicionarTurma(turma1);
        curso2.adicionarTurma(turma2);

        // criar os alunos
        Aluno a1 = new Aluno("Alex", "Aluno001", "alex@email.com");
        Aluno a2 = new Aluno("Bena", "Aluno002", "bena@email.com");
        Aluno a3 = new Aluno("Amora", "Aluno003", "amora@email.com");
        Aluno a4 = new Aluno("Waldean", "Aluno004", "bigw@email.com");
        Aluno a5 = new Aluno("Paloma", "Aluno005", "paloma@email.com");

        // matriculando alunos
        new Matricula(a1, turma1);
        new Matricula(a2, turma1);
        new Matricula(a3, turma1);
        new Matricula(a4, turma2);
        new Matricula(a5, turma2);
        new Matricula(a1, turma2); // aluno em mais de uma turma
        new Matricula(a3, turma2); // aluno em mais de uma turma

        // criando avaliações para a primeira turma(turma1)
        Avaliacao av1 = new Avaliacao("Prova 1", 10, 0.4, turma1);
        Avaliacao av2 = new Avaliacao("Trabalho", 10, 0.3, turma1);
        Avaliacao av3 = new Avaliacao("Projeto", 10, 0.3, turma1);

        // Criando avaliações pra segunda turma(turma2)
        Avaliacao av4 = new Avaliacao("Prova 1", 10, 0.5, turma2);
        Avaliacao av5 = new Avaliacao("Trabalho", 10, 0.2, turma2);
        Avaliacao av6 = new Avaliacao("Projeto", 10, 0.3, turma2);

        // Criando submissões (turma1)
        new Submissao(a1, av1, 8, new String("2024, 4, 10"), "Boa resposta");
        new Submissao(a2, av1, 6, new String("2024, 4, 10"), "Parcial");
        new Submissao(a3, av1, 9, new String("2024, 4, 10"), "Ótimo");

        new Submissao(a1, av2, 7, new String("2024, 4, 15"), "Completou quase tudo");
        new Submissao(a2, av2, 6, new String("2024, 4, 15"), "Faltou uma parte");
        new Submissao(a3, av2, 10, new String("2024, 4, 15"), "Excelente");

        new Submissao(a1, av3, 10, new String("2024, 4, 20"), "Muito bom");
        new Submissao(a2, av3, 7, new String("2024, 4, 20"), "Ok");
        new Submissao(a3, av3, 8, new String("2024, 4, 20"), "Bom");

        // Submissões turma2
        new Submissao(a4, av4, 6, new String("2024, 4, 12"), "Falta atividade 3.");
        new Submissao(a5, av4, 9, new String("2024, 4, 12"), "Neutro");
        new Submissao(a1, av4, 7, new String("2024, 4, 12"), "Extra");

        new Submissao(a4, av5, 5, new String("2024, 4, 17"), "Vazio");
        new Submissao(a5, av5, 10, new String("2024, 4, 17"), "Vazio");
        new Submissao(a1, av5, 8, new String("2024, 4, 17"), "Vazio");

        new Submissao(a4, av6, 9, new String("2024, 4, 22"), "Eu nao usaria essa avaliação nem como papel higienico");
        new Submissao(a5, av6, 7, new String("2024, 4, 22"), "Recuperação");
        new Submissao(a1, av6, 10, new String("2024, 4, 22"), "OLAAAAAAAAAAAA");





        // Curso e professores
        System.out.println("Cursos e Professores:");
        System.out.println(curso1.getNome() + " - Professor: " + curso1.getProfessor().getNome());
        System.out.println(curso2.getNome() + " - Professor: " + curso2.getProfessor().getNome());

        //Turmas e curso
        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);

        for (Curso curso : cursos) {
            for (Turma turma : curso.getTurmas()) {
                System.out.println("Turma: " + turma.getCodigo() +
                        " - Período: " + turma.getPeriodo() +
                        " - Curso: " + curso.getNome() +
                        " - Professor: " + curso.getProfessor().getNome());
            }
        }

        //Alunos em turmas matriculadas
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        for (Aluno aluno : alunos) {
            System.out.println("\nAluno: " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
            System.out.print("Matriculado em: ");
            List<Matricula> matriculas = aluno.getMatriculas();
            for (int i = 0; i < matriculas.size(); i++) {
                Turma turma = matriculas.get(i).getTurma();
                System.out.print(turma.getCodigo());
                if (i < matriculas.size() - 1) System.out.print(", ");
            }
            System.out.println("\n");
        }

        //Avaliações de turmas
        List<Turma> todasAsTurmas = new ArrayList<>();
        todasAsTurmas.add(turma1);
        todasAsTurmas.add(turma2);

        System.out.println("\nAvaliações por Turma:");
        for (Turma turma : todasAsTurmas) {
            System.out.println("Turma: " + turma.getCodigo() + " - Curso: " + turma.getCurso().getNome());
            for (Avaliacao avaliacao : turma.getAvaliacoes()) {
                System.out.println("  - Tipo: " + avaliacao.getTipo() +
                        " | Nota Máxima: " + avaliacao.getNotaMaxima() +
                        " | Peso: " + avaliacao.getPeso());
            }
            System.out.println();
        }

        //Submissões de alunos
        System.out.println("📤 Submissões por Avaliação:");
        for (Avaliacao avaliacao : turma1.getAvaliacoes()) {
            System.out.println("Avaliação: " + avaliacao.getTipo() + " (Turma: " + turma1.getCodigo() + ")");
            for (Submissao sub : avaliacao.getSubmissoes()) {
                System.out.println("  - Aluno: " + sub.getAluno().getNome() +
                        " | Nota: " + sub.getNota() +
                        " | Data: " + sub.getDataEntrega() +
                        " | Observações: " + sub.getObservacoes());
            }
            System.out.println();
        }


        // Geração de relatório de desempenho e todos os alunos matriculados
        System.out.println("\nRelatório de " + a2.getNome() + " na turma " + turma1.getCodigo());
        RelatorioDesempenho.gerarRelatorio(a2, turma1);
        System.out.println("\nRelatório de " + a1.getNome() + " na turma " + turma2.getCodigo());
        RelatorioDesempenho.gerarRelatorio(a1, turma2);

    }
}
