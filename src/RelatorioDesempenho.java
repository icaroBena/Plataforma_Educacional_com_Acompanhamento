import java.util.List;

public class RelatorioDesempenho {

    public static void gerarRelatorio(Aluno aluno, Turma turma) {
        double somaNotas = 0;
        double somaPesos = 0;

        for (Avaliacao a : turma.getAvaliacoes()) {
            for (Submissao s : a.getSubmissões()) {
                if (s.getAluno().equals(aluno)) {
                    somaNotas += s.getNota() * a.getPeso();
                    somaPesos += a.getPeso();
                    System.out.println("Avaliação: " + a.getTipo() + " - Nota: " + s.getNota());
                }
            }
        }

        double media = somaPesos == 0 ? 0 : somaNotas / somaPesos;
        System.out.println("Média Ponderada: " + media);
    }
}
