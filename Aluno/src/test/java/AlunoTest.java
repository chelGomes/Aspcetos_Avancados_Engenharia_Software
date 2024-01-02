import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    @Test
     public void deveImprirDadosAlunoFormando(){
       String nomeAluno = "jose";
       String nomeCurso = "Engenharia";
       Aluno aluno = new Aluno();
       aluno.setNome(nomeAluno);
       aluno.setNomeCurso(nomeCurso);
       assertEquals("Nome do aluno: " + nomeAluno + "nome do curso:" + nomeCurso, aluno.imprimirDiploma());
    }
}
