public class Aluno extends Pessoa {
    private int matricula;
    private int ano;
    private char sala;
    private String[] disciplinas;
    private double[] medias;
    private double mensalidade;



    public Aluno(String nome, String cpf, String telefone, int idade, int matricula, int ano, char sala, String[] disciplinas, double[] medias, double mensalidade) {
        super(nome, cpf, telefone, idade);
        this.matricula = matricula;
        this.ano = ano;
        this.sala = sala;
        this.disciplinas = disciplinas;
        this.medias = medias;
        this.mensalidade = mensalidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getSala() {
        return sala;
    }

    public void setSala(char sala) {
        this.sala = sala;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[] getMedias() {
        return medias;
    }

    public void setMedias(double[] medias) {
        this.medias = medias;
    }


    @Override
    public void mandarComunicado(String nome) {
        System.out.printf("Caro aluno %s: %n Este é um comunicado oficial", this.getNome());
    }
}
