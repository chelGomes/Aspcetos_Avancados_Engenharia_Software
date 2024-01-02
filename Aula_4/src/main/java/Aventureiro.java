// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

public class Aventureiro {
    private String habilidade;
    private Atributo atributo;

    public Aventureiro(Atributo atributo) {
        if(atributo == null){
            throw new NullPointerException("Atributo invalido");
        }
        this.atributo = atributo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String imprimir() {
       return this.atributo.imprimir(this.habilidade);
    }

}