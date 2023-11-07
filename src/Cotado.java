public class Cotado extends Estado {
    @Override
    public Estado encomenda() {
        System.out.println("Encomendando o pedido.");
        return new Encomendado();
    }

    @Override
    public Estado rejeita() {
        System.out.println("Pedido foi rejeitado após a cotação.");
        return new Rejeitado();
    }
}