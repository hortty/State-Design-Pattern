public class Pedido {
    public Estado estado;

    public Pedido() {
        this.estado = new Solicita();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void solicita() {
        this.estado = this.estado.solicita();
    }

    public void cotacao() {
        this.estado = this.estado.cotacao();
    }

    public void encomenda() {
        this.estado = this.estado.encomenda();
    }

    public void entrega() {
        this.estado = this.estado.entrega();
    }

    public void paga() {
        this.estado = this.estado.paga();
    }

    public void rejeita() {
        this.estado = this.estado.rejeita();
    }

    public void cancela() {
        this.estado = this.estado.cancela();
    }

    public void arquiva() {
        this.estado = this.estado.arquiva();
    }
}
