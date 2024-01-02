public class HamburguerSimples implements HamburguerPersonalizado {
    private String descricao;
    private double precoBase;

    public HamburguerSimples() {
        this.descricao = "Hamburguer Simples";
        this.precoBase = 15.0;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public double preco() {
        return precoBase;
    }
}
