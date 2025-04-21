public class Matricula {
    private Aluno aluno;
    private Turma turma;

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public Aluno getAluno() {
        return this.aluno;
    }
    public Turma getTurma() {
        return this.turma;
    }

    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        aluno.adicionarMatricula(this);
        turma.adicionarMatricula(this);
    }
}
