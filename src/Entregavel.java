public interface Entregavel {
    void realizarEntrega(String endereco);
    double calcularTempoEstimado(double distancia);
    double calcularFrete(double distancia);
}
