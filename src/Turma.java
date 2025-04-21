import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private String periodo;
    private Curso curso;
    private List<Matricula> matriculas;
    private List<Avaliacao> avaliacoes;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    public List<Avaliacao> getAvaliacoes() {
        return this.avaliacoes;
    }
    public List<Matricula> getMatriculas() {
        return matriculas;
    }
    public Curso getCurso() {
        return this.curso;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public String getPeriodo() {
        return this.periodo;
    }


    public Turma(String codigo, String periodo, Curso curso) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.curso = curso;
        this.matriculas = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarMatricula(Matricula m) {
        matriculas.add(m);
    }

    public void adicionarAvaliacao(Avaliacao a) {
        avaliacoes.add(a);
    }

    // Getters e Setters
}
