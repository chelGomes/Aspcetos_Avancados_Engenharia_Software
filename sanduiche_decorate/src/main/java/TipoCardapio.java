public class TipoCardapio implements CategoriaLanche {
  double preco;

  public TipoCardapio(double preco){
      this.preco = preco;
  }

    @Override
    public double getAcrescimoPreco(double preco) {
        return preco;
    }

    @Override
    public double getPreco(){
      return this.preco;
  }

  @Override
    public String getDescricao(){
      return "Nome Hamburguer";
  }
}

