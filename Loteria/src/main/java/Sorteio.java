import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio implements SorteioLoteria {

    private static final int MAXIMO_NUMERO_SORTEADO = 59;

    private List<Integer> numeros;

    public Sorteio(int quantidadeNumeros) {
        this.numeros = sortear(quantidadeNumeros);
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> getNumerosSorteados() {
        return this.numeros;
    }

    @Override
    public void setNumerosSorteados(List<Integer> numerosSorteados) {

    }

    List<Integer> sortear(int quantidadeNumeros) {
        List<Integer> sorteados = new ArrayList<>();
        int numeroSorteado;
        while (sorteados.size() < quantidadeNumeros) {
            numeroSorteado = new Random().nextInt(MAXIMO_NUMERO_SORTEADO) + 1;
            if (!sorteados.contains(numeroSorteado)) {
                sorteados.add(numeroSorteado);
            }
        }
        return sorteados;
    }

    public void sortearNumeros(int i) {
    }
}