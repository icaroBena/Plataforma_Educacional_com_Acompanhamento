public class Professor {
    private String nome;
    private String especialidade;
    private String id;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    public String getId() {
        return this.id;
    }

    public Professor(String nome, String especialidade, String id) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.id = id;
    }
}
