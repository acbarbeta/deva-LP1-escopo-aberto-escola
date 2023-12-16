public final class Atendente extends Funcionario {
    private String setor;
    private boolean terceirizado;

    public Atendente(String nome, String cpf, String telefone, int idade, float salario, String dataDeContratacao, boolean estagiario, String turno, String setor, boolean terceirizado) {
        super(nome, cpf, telefone, idade, salario, dataDeContratacao, estagiario, turno);
        this.setor = setor;
        this.terceirizado = terceirizado;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTerceirizado() {
        return terceirizado;
    }

    public void setTerceirizado(boolean terceirizado) {
        this.terceirizado = terceirizado;
    }
}
