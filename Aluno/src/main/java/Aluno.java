
public class Aluno {
    private String nome;
    private String nomeCurso;


    public Aluno(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String imprimirDiploma(){
        return Diploma.getInstancia().formata(this);
    }

}


