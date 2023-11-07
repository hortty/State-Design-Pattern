public class Encomendado extends Estado {
    @Override
    public Estado entrega() {
        System.out.println("Entregando o pedido.");
        return new Faturado();
    }

    @Override
    public Estado cancela() {
        System.out.println("Cancelando o pedido.");
        return new Cancelado();
    }
}