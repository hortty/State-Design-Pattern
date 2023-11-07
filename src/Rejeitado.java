public class Rejeitado extends Estado {
    @Override
    public Estado arquiva() {
        System.out.println("Arquivando o pedido rejeitado.");
        return new Arquiva();
    }
}