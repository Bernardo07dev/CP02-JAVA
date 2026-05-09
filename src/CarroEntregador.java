public class CarroEntregador extends Entregador {
    public CarroEntregador(String nome) {
        super(nome, "Carro");
    }

    @Override
    public double calcularFrete(double distancia) {
        return distancia * 2;
    }

    @Override
    public void realizarEntrega(String destino) {
        System.out.println("O carro de entrega conduzido por " + getNome() + " está em rota para: " + destino);
    }

    @Override
    public double calcularTempoEstimado(double distancia) {
        return 0;
    }
}
