public class Cancelado extends Estado {
    @Override
    public Estado arquiva() {
        System.out.println("Arquivando o pedido cancelado.");
        return new Arquiva();
    }
}