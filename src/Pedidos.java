public abstract class Pedidos implements IPedidos{
    private int id;
    private String destino;
    private String status;

    public Pedidos(int id, String destino) {
        this.id = id;
        this.destino = destino;
        this.status = "PENDENTE";
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do pedido " + id + " alterado para: " + novoStatus);
    }

    public void atualizarStatus(String novoStatus, String observacao) {
        this.status = novoStatus;
        System.out.println("Status: " + novoStatus + " | Obs: " + observacao);
    }

    @Override
    public String obterStatusRastreio() {
        return "Pedido #" + id + " - Status atual: " + status;
    }

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public String getStatus() {
        return status;
    }
}
