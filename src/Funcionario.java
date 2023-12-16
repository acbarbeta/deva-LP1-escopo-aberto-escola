public class Funcionario extends Pessoa {
    private float salario;
    private String dataDeContratacao;
    private boolean estagiario;
    private String turno;

    public Funcionario(String nome, String cpf, String telefone, int idade, float salario, String dataDeContratacao, boolean estagiario, String turno) {
        super(nome, cpf, telefone, idade);
        this.salario = salario;
        this.dataDeContratacao = dataDeContratacao;
        this.estagiario = estagiario;
        this.turno = turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public boolean isEstagiario() {
        return estagiario;
    }

    public void setEstagiario(boolean estagiario) {
        this.estagiario = estagiario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void mandarComunicado(String nome) {
        System.out.printf("Prezado funcionário %s: %n Este é um comunicado oficial", this.getNome());
    }
}
