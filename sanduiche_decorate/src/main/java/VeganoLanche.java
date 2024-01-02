public class VeganoLanche implements CategoriaLanche{
    @Override
    public double getAcrescimoPreco(double preco) {
        return preco + preco;
    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return null;
    }
}
