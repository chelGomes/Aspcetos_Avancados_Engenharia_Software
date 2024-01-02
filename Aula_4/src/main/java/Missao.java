public class Missao {
    String habilidade;
    public static void main(String args[]) {

    }

    public String guerreiro(){
        Aventureiro aventureiro = new Aventureiro(new Guerreiro());
        aventureiro.setHabilidade("Força");
        habilidade = aventureiro.getHabilidade();
        return habilidade;
    }

    public String ladino(){
        Aventureiro aventureiro = new Aventureiro(new Ladino());
        aventureiro.setHabilidade("Destreza");
        habilidade = aventureiro.getHabilidade();
        return habilidade;
    }

    public String mago(){
        Aventureiro aventureiro = new Aventureiro(new Mago());
        aventureiro.setHabilidade("Inteligencia");
        habilidade = aventureiro.getHabilidade();
        return habilidade;
    }
}
