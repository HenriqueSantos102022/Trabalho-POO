public class Aluno {

    private String nome;
    private int idade;
    private Curso curso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso.getNomeCurso());
        System.out.println("Carga Horária: " + curso.getCargaHoraria());
    }
}