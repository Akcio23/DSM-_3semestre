package ex1;

class FabricaDeOrcs extends FabricaDePersonagens {
    @Override
    public Personagem criarPersonagem() {
        return new Personagem("Orc", 14, 8, 6);
    }
}