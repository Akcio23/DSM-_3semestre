package ex2;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
    List<String> ingredientes=new ArrayList<>();
    String tamanho;
    String tipoDeMassa;


    public Pedido(List<String> ingredientes, String tamanho, String tipoDeMassa) {
        this.ingredientes = new ArrayList<>(ingredientes);
        this.tamanho = tamanho;
        this.tipoDeMassa = tipoDeMassa;
    }
    public void addIgredientes(String newIgrediente) {
        ingredientes.add(newIgrediente);
        System.out.println("Igrediente adicionado!");

    }
}
