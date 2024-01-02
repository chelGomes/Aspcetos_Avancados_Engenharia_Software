public class PaoHamburguerIntegral extends PersonalizacaoDecorator {
    public PaoHamburguerIntegral(HamburguerPersonalizado hamburguerPersonalizado) {
        super(hamburguerPersonalizado);
    }

    @Override
    public String descricao() {
        return hamburguerPersonalizado.descricao() + ", Pão Integral";
    }

    @Override
    public double preco() {
        return hamburguerPersonalizado.preco() + 1.0;
    }
}
