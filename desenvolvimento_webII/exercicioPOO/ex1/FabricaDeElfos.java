package ex1;

class FabricaDeElfos extends FabricaDePersonagens {
    @Override
    public Personagem criarPersonagem() {
        return new Personagem("Elfo", 8, 12, 14);
    }
}