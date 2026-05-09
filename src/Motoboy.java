public class Motoboy extends Entregador {
    private String placaMoto;

    public Motoboy(String nome, String placaMoto) {
        super(nome, "Moto");
        this.placaMoto = placaMoto;
        this.placaMoto = placaMoto;
    }

    @Override
    public double calcularFrete(double distancia) {
        return distancia * 1.50;
    }

    @Override
    public void realizarEntrega(String destino) {
        System.out.println("O motoboy " + getNome() + " está acelerando para o destino: " + destino);
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    @Override
    public double calcularTempoEstimado(double distancia) {
        return 0;
    }
}
