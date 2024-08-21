package ex2;


public class PedidoBuilder {
    Pedido pedido;
    public PedidoBuilder(Pedido pedido) {
        this.pedido = pedido;
    }
    public void  construir(){
       System.out.println("Pedido Realizado!!!!!!!!");
        System.out.println("Ingredientes : " + pedido.ingredientes);
        System.out.println("Tamanho : " + pedido.tamanho);
        System.out.println("Massa : " + pedido.tipoDeMassa);
    }
}


