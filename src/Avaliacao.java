import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
    private String tipo;
    private double notaMaxima;
    private double peso;
    private Turma turma;
    private List<Submissao> submissões;

    public void setNotaMaxima(double notaMaxima) {
        this.notaMaxima = notaMaxima;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setSubmissões(List<Submissao> submissões) {
        this.submissões = submissões;
    }

    public String getTipo() {
        return this.tipo;
    }
    public double getNotaMaxima() {
        return this.notaMaxima;
    }
    public double getPeso() {
        return this.peso;
    }
    public Turma getTurma() {
        return this.turma;
    }
    public List<Submissao> getSubmissões() {
        return this.submissões;
    }

    public Avaliacao(String tipo, double notaMaxima, double peso, Turma turma) {
        this.tipo = tipo;
        this.notaMaxima = notaMaxima;
        this.peso = peso;
        this.turma = turma;
        this.submissões = new ArrayList<>();
        turma.adicionarAvaliacao(this);
    }

    public void adicionarSubmissao(Submissao s) {
        submissões.add(s);
    }
}
