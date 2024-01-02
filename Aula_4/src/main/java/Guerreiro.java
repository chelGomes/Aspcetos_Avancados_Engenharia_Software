// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência


public class Guerreiro implements Atributo {

    public String imprimir(String habilidade) {
        return ("Guerreiro: " + habilidade);
    }
}