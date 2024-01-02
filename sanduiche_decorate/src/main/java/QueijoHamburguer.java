public class QueijoHamburguer extends PersonalizacaoDecorator {
    public QueijoHamburguer(HamburguerPersonalizado hamburguer) {
        super(hamburguer);
    }

    @Override
    public String descricao() {
        return hamburguerPersonalizado.descricao() + ", Queijo";
    }

    @Override
    public double preco() {
        return hamburguerPersonalizado.preco() + 10.0;
    }
}
