package ex3;

public class Singleton {

    // Instância única da classe Singleton
    private static Singleton instanciaUnica;

    // Construtor privado para evitar a criação de novas instâncias
    private Singleton() {
        // Inicialização de recursos, se necessário
    }

    // Método público para fornecer acesso à instância única
    public static synchronized Singleton getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }
}
