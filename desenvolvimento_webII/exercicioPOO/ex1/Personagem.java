package ex1;

class Personagem {
    private String raca;
    private int forca;
    private int agilidade;
    private int inteligencia;

    public Personagem(String raca, int forca, int agilidade, int inteligencia) {
        this.raca = raca;
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
    }

    public void exibirAtributos() {
        System.out.println("Raça: " + raca + ", Força: " + forca + ", Agilidade: " + agilidade + ", Inteligência: " + inteligencia);
    }
}