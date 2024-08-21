package ex3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompra one = CarrinhoDeCompra.getInstancia();
        CarrinhoDeCompra two = CarrinhoDeCompra.getInstancia();

        one.AddItem("tomate");
        one.AddItem("azeitona");
        one.ReturnCarrinho();
        one.removeItem("tomate");
        one.ReturnCarrinho();


}};
