public abstract class Entregador implements Entregavel {
    private String nome;
    private String veiculo;

    public Entregador(String nome, String veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public void imprimirDados() {
        System.out.println("Entregador: " + nome + " | Veículo: " + veiculo);
    }

    public String getNome() {
        return nome;
    }

    public String getVeiculo() {
        return this.veiculo;
    }
}
