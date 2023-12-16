public final class Bolsista extends Aluno {
    private double descontoDaBolsa;

    public Bolsista(String nome, String cpf, String telefone, int idade, int matricula, int ano, char sala, String[] disciplinas, double[] medias, double descontoDaBolsa, double mensalidade) {
        super(nome, cpf, telefone, idade, matricula, ano, sala, disciplinas, medias, mensalidade);
        this.descontoDaBolsa = descontoDaBolsa;
    }

    public double getDescontoDaBolsa() {
        return descontoDaBolsa;
    }

    public void setDescontoDaBolsa(double descontoDaBolsa) {
        this.descontoDaBolsa = descontoDaBolsa;
    }

    public final double calculaMensalidade(double mensalidade, double descontoDaBolsa) {
        double mensalidadeComDesconto = mensalidade * (1 - (descontoDaBolsa / 100));
        return mensalidadeComDesconto;
    }
}
