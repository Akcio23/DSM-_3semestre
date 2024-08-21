package ex2;

import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        Pedido pedidoOne = new Pedido(Arrays.asList("tomate","oregano"),"G","Fina");
        PedidoBuilder pedidoFinal = new PedidoBuilder(pedidoOne);
        pedidoOne.addIgredientes("Azeitona");
        pedidoFinal.construir();
    }
}
