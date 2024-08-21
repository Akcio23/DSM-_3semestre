package ex1;

public class Main {
    public static void main(String[] args) {

        FabricaDePersonagens fabricaDeHumanos = new FabricaDeHumanos();
        Personagem humano = fabricaDeHumanos.criarPersonagem();
        humano.exibirAtributos();

        // Cria um Elfo
        FabricaDePersonagens fabricaDeElfos = new FabricaDeElfos();
        Personagem elfo = fabricaDeElfos.criarPersonagem();
        elfo.exibirAtributos();

        // Cria um Orc
        FabricaDePersonagens fabricaDeOrcs = new FabricaDeOrcs();
        Personagem orc = fabricaDeOrcs.criarPersonagem();
        orc.exibirAtributos();
    }
}