import java.time.LocalDate;

public class Submissao {
    private Aluno aluno;
    private Avaliacao avaliacao;
    private double nota;
    private String dataEntrega;
    private String observacoes;

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Aluno getAluno() {
        return this.aluno;
    }
    public Avaliacao getAvaliacao() {
        return this.avaliacao;
    }
    public double getNota() {
        return this.nota;
    }
    public String getDataEntrega() {
        return this.dataEntrega;
    }
    public String getObservacoes() {
        return this.observacoes;
    }

    public Submissao(Aluno aluno, Avaliacao avaliacao, double nota, String dataEntrega, String observacoes) {
        this.aluno = aluno;
        this.avaliacao = avaliacao;
        this.nota = nota;
        this.dataEntrega = dataEntrega;
        this.observacoes = observacoes;
        avaliacao.adicionarSubmissao(this);
    }

    // Getters
}
