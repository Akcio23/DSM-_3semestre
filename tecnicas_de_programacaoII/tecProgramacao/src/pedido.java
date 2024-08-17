import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class pedido {
    int codigo;
    String nomeCliente;
    List<produto>listaProduto;

    public pedido(int codigo) {
        this.codigo = codigo;
        this.listaProduto = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pedido pedido = (pedido) o;
        return Objects.equals(codigo, pedido.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setListaProduto(List<produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
}
