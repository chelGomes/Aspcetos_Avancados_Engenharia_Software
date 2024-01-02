public class Diploma implements IDiploma{

    private Diploma(){};

    //private static Diploma diploma = new Diploma();
    private static Diploma diploma ;

    public static Diploma getInstancia(){
        if(diploma == null){
            diploma = new Diploma();
        }
        return diploma;
    }
   public String formata(Aluno aluno){
       return "Nome do aluno: " + aluno.getNome() + "nome do curso: " + aluno.getNomeCurso();
   }
}


/* pensar numa situação utilizando apenas um objeto no padrão de projeto */