import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private List<Matricula> matriculas; // relação com turmas

    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.matriculas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public String getEmail() {
        return this.email;
    }
    public List<Matricula> getMatriculas() {
        return this.matriculas;
    }

    public void adicionarMatricula(Matricula m) {
        matriculas.add(m);
    }

    // Getters e Setters
}
