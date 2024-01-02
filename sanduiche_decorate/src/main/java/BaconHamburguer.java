public class BaconHamburguer extends PersonalizacaoDecorator {
    public BaconHamburguer(HamburguerPersonalizado hamburguer) {
        super(hamburguer);
    }

    @Override
    public String descricao() {
        return hamburguerPersonalizado.descricao() + ", Bacon";
    }

    @Override
    public double preco() {
        return hamburguerPersonalizado.preco() + 8.0;
    }
}
