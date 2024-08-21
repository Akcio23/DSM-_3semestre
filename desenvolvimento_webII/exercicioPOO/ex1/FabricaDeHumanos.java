package ex1;

class FabricaDeHumanos extends FabricaDePersonagens {
    @Override
    public Personagem criarPersonagem() {
        return new Personagem("Humano", 10, 10, 10);
    }
}