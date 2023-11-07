public class Solicita extends Estado {
    @Override
    public Estado cotacao() {
        System.out.println("Gerando cotação para o pedido.");
        return new Cotado();
    }
}
