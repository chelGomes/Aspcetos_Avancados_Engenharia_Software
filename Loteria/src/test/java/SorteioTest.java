import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SorteioTest {

    private Sorteio sorteio;

    @BeforeEach
    public void setUp() {

        sorteio = new Sorteio(6);
    }


    @Test
    public void testSorteioComQuantidadeValida() {
        int quantidadeNumeros = 6;
        List<Integer> numerosSorteados = sorteio.sortear(quantidadeNumeros);
        assertNotNull(numerosSorteados);
        assertEquals(quantidadeNumeros, numerosSorteados.size());
    }

    @Test
    public void testNumerosSorteadosDiferentes() {
        int quantidadeNumeros = 6;
        List<Integer> numerosSorteados1 = sorteio.sortear(quantidadeNumeros);
        List<Integer> numerosSorteados2 = sorteio.sortear(quantidadeNumeros);
        assertNotEquals(numerosSorteados1, numerosSorteados2);
    }
}