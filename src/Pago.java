public class Pago extends Estado {
    @Override
    public Estado arquiva() {
        System.out.println("Arquivando o pedido pago.");
        return new Arquiva();
    }
}