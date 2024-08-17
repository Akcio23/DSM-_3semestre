public class Main {
    public static void main(String[] args) {

        produto p1 = new produto(123,"Geladeira",1500);
        produto p2 = new produto(222,"fogão",2000);
        produto p3 = new produto(333,"mesa",500);
        produto p4 = new produto(444,"papel",3000);

        pedido x = new pedido(001);
        x.setNomeCliente("Pedro Afonso");
        x.listaProduto.add(p1);
        x.listaProduto.add(p2);
        x.listaProduto.add(p3);

        pedido y = new pedido(002);
        y.setNomeCliente("Isabela Cristina");
        y.listaProduto.add(p2);
        y.listaProduto.add(p3);
        y.listaProduto.add(p4);
        y.listaProduto.add(p2);

        if (x.equals(y)){
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
        if (p1.equals(p1)){
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
        if (p2.equals(p3)){
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
    }
}