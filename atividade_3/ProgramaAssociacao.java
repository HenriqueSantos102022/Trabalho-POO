public class ProgramaAssociacao {

    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setNomeCurso("Informática");
        c1.setCargaHoraria(1250);

        Aluno a1 = new Aluno();
        a1.setNome("Ana Santos");
        a1.setIdade(17);
        a1.setCurso(c1);

        a1.exibirDados();
    }
}