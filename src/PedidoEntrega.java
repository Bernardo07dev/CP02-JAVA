public class PedidoEntrega extends Pedidos {
    private Entregador entregadorResponsavel;

    public PedidoEntrega(int id, String enderecoDestino) {
        super(id, enderecoDestino);
    }

    @Override
    public double calcularPrazoEstimado() {
        return getDestino().toLowerCase().contains("sp") ? 2.0 : 5.0;
    }

    public void atribuirEntregador(Entregador entregador) {
        this.entregadorResponsavel = entregador;
        atualizarStatus("EM ROTA", "Entregador " + entregador.getNome() + " assumiu o pedido.");
    }

    public Entregador getEntregadorResponsavel() {
        return entregadorResponsavel;
    }
}
