public abstract class PersonalizacaoDecorator implements HamburguerPersonalizado {
    protected HamburguerPersonalizado hamburguerPersonalizado;

    public PersonalizacaoDecorator(HamburguerPersonalizado hamburguerPersonalizado) {
        this.hamburguerPersonalizado = hamburguerPersonalizado;
    }

    @Override
    public String descricao() {
        return hamburguerPersonalizado.descricao();
    }

    @Override
    public double preco() {
        return hamburguerPersonalizado.preco();
    }
}
