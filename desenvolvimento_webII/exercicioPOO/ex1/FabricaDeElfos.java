package ex1;

class FabricaDeElfos extends FabricaDePersonagens {
    @Override
    public Personagem criarPersonagem() {
        return new Personagem("Elfo", 80, 15, 55);
    }
}