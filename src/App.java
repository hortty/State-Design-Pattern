// Alunos: Alexandre Faisst, Gabriel Hortmann, Jonathan Domingos e Diego Zanella

public class App {
    public static void main(String[] args) throws Exception {
        Pedido meuPedido_1 = new Pedido();

        System.out.println("Fluxo 1:");
        meuPedido_1.solicita();
        meuPedido_1.cotacao();
        meuPedido_1.rejeita();
        meuPedido_1.arquiva();
        System.out.println();
        System.out.println();

        Pedido meuPedido_2 = new Pedido();

        System.out.println("Fluxo 2:");
        meuPedido_2.solicita();
        meuPedido_2.cotacao();
        meuPedido_2.encomenda();
        meuPedido_2.entrega();
        meuPedido_2.arquiva();
        System.out.println();
        System.out.println();

        Pedido meuPedido_3 = new Pedido();

        System.out.println("Fluxo 3:");
        meuPedido_3.solicita();
        meuPedido_3.cotacao();
        meuPedido_3.encomenda();
        meuPedido_3.cancela();
        meuPedido_3.arquiva();
        System.out.println();
        System.out.println("FIM");
    }
}




