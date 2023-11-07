public class Estado {
    public Estado solicita() {
        System.out.println("Solicitado pedido");
        return this;
    }

    public Estado cotacao() {
        System.out.println("Cotação já gerada para o pedido.");
        return this;
    }

    public Estado encomenda() {
        System.out.println("Pedido precisa ser cotado antes de ser encomendado.");
        return this;
    }

    public Estado entrega() {
        System.out.println("Pedido precisa ser encomendado antes de ser entregue.");
        return this;
    }

    public Estado paga() {
        System.out.println("Pedido precisa ser encomendado e faturado antes de ser pago.");
        return this;
    }

    public Estado rejeita() {
        System.out.println("Pedido precisa passar por várias etapas para ser rejeitado");
        return this;
    }

    public Estado cancela() {
        System.out.println("Pedido precisa passar por várias etapas para ser cancelado");
        return this;
    }

    public Estado arquiva() {
        System.out.println("Pedido precisa passar por várias etapas para ser arquivado");
        return this;
    }
}