package ex3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private static CarrinhoDeCompra instanciaUnica;
    private List<String> ListaPedido = new ArrayList<>();


    private CarrinhoDeCompra(){
        this.ListaPedido = new ArrayList<>(ListaPedido);
    };

    public static CarrinhoDeCompra getInstancia(){
        if (instanciaUnica == null){
            instanciaUnica = new CarrinhoDeCompra();
            System.out.println("Objeto instanciado");
        }else {
            System.out.println("Erro!! objeto ja instanciado");
        }
        return instanciaUnica;
    };

    public void AddItem(String item){
        this.ListaPedido.add(item);
        System.out.println("Item adicionado com sucesso!");
    }
    public void removeItem(String item){
        this.ListaPedido.remove(item);
        System.out.println("Item removido com sucesso!");
    }
    public void ReturnCarrinho(){
        System.out.println(ListaPedido);
    }
}
