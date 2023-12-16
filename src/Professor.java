public final class Professor extends Funcionario{
    private String disciplina;
    private String[][] horarioDeAulasNaSemana;

    public Professor(String nome, String cpf, String telefone, int idade, float salario, String dataDeContratacao, boolean estagiario, String turno, String disciplina, String[][] horarioDeAulasNaSemana) {
        super(nome, cpf, telefone, idade, salario, dataDeContratacao, estagiario, turno);
        this.disciplina = disciplina;
        this.horarioDeAulasNaSemana = horarioDeAulasNaSemana;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String[][] getHorarioDeAulasNaSemana() {
        return horarioDeAulasNaSemana;
    }

    public void setHorarioDeAulasNaSemana(String[][] horarioDeAulasNaSemana) {
        this.horarioDeAulasNaSemana = horarioDeAulasNaSemana;
    }
}
