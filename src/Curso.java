import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private Professor professor;
    private List<Turma> turmas;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    public String getNome() {
        return this.nome;
    }
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public String getEmenta() {
        return this.ementa;
    }
    public Professor getProfessor() {
        return this.professor;
    }
    public List<Turma> getTurmas() {
        return this.turmas;
    }

    public Curso(String nome, int cargaHoraria, String ementa, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.professor = professor;
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}
