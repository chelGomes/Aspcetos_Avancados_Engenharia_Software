import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class ApostaTest {

    private Aposta aposta;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testApostaValida() {
        List<Integer> numerosApostados = Arrays.asList(1, 2, 3, 4, 5, 6);
        aposta = new Aposta(numerosApostados);

        assertEquals(numerosApostados, aposta.getNumerosApostados());
    }

    @Test
    public void testApostaAbaixoMinima() {
        List<Integer> numerosApostados = Arrays.asList(1, 2, 3, 4, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            aposta = new Aposta(numerosApostados);
        });
    }

    @Test
    public void testApostaAcimaMaxima() {
        List<Integer> numerosApostados = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertThrows(IllegalArgumentException.class, () -> {
            aposta = new Aposta(numerosApostados);
        });
    }

    @Test
    public void testNumeroForaLimite() {
        List<Integer> numerosApostados = Arrays.asList(1, 2, 3, 4, 5, 61);
        assertThrows(IllegalArgumentException.class, () -> {
            aposta = new Aposta(numerosApostados);
        });
    }

    @Test
    public void testNumeroDuplicado() {
        List<Integer> numerosApostados = Arrays.asList(1, 2, 3, 4, 5, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            aposta = new Aposta(numerosApostados);
        });
    }
}
