public class PaoHamburguerComum extends PersonalizacaoDecorator{
    public PaoHamburguerComum(HamburguerPersonalizado hamburguerPersonalizado) {
        super(hamburguerPersonalizado);
    }

    @Override
    public String descricao() {
        return hamburguerPersonalizado.descricao() + ", Pão Comum";
    }

    @Override
    public double preco() {
        return hamburguerPersonalizado.preco() + 1.5;
    }
}
