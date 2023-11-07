public class Faturado extends Estado {
    @Override
    public Estado paga() {
        System.out.println("Pagando o pedido.");
        return new Pago();
    }

    @Override
    public Estado arquiva() {
        System.out.println("Arquivando o pedido faturado.");
        return new Arquiva();
    }
}