import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Entregador ---");
        System.out.print("Nome do Motoboy: ");
        String nomeM = scanner.nextLine();
        System.out.print("Placa da Moto: ");
        String placa = scanner.nextLine();

        Motoboy motoboy = new Motoboy(nomeM, placa);

        System.out.println("\n--- Criar Pedido ---");
        System.out.print("ID do Pedido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        PedidoEntrega pedido = new PedidoEntrega(id, endereco);

        System.out.println("\n=== Processando Logística ===");
        pedido.atribuirEntregador(motoboy);
        System.out.println(pedido.obterStatusRastreio());
        motoboy.imprimirDados();
        motoboy.realizarEntrega(pedido.getDestino());
        System.out.println("\nSistema finalizado com sucesso!");
        scanner.close();
    }
}