package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp(){
        pessoa = new Pessoa();
    }

    @Test
    void deveRetonarFemininoAbaixoPeso(){
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('F');
        assertEquals("abaixo do peso", pessoa.calculaIMC());
    }

    @Test
    void deveRetonarFemininoPesoNormal(){
        pessoa.setPeso(25.6f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('F');
        assertEquals("no peso normal", pessoa.calculaIMC());
    }

    @Test
    void deveRetonarFemininoMarginalmenteAcimaPeso(){
        pessoa.setPeso(27.1f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('F');
        assertEquals("marginalmente acima do peso", pessoa.calculaIMC());
    }

    @Test
    void deveRetonarFemininoAcimaPeso(){
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('F');
        assertEquals("acima do peso ideal", pessoa.calculaIMC());
    }

    @Test
    void deveRetonarObeso(){
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo('F');
        assertEquals("obeso", pessoa.calculaIMC());
    }

    @Test
    void deveRetonarExcessaoSexoInavalido(){
        try{
            pessoa.setSexo('A');
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("sexo invalido",e.getMessage());
        }
    }
}
