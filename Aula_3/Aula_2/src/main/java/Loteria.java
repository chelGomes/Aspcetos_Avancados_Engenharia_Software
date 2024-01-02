import java.util.*;

public class Loteria {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 60;
    private static final int MIN_NUM_COUNT = 6;
    private static final int MAX_NUM_COUNT = 15;

    public static List<Integer> validarNumeros(List<Integer> numerosApostados) {
        Set<Integer> numerosValidos = new HashSet<>();
        for (Integer numero : numerosApostados) {
            if (numero < MIN_NUM || numero > MAX_NUM) {
                throw new IllegalArgumentException("Os números devem estar entre " + MIN_NUM + " e " + MAX_NUM + ".");
            }
            if (numerosValidos.contains(numero)) {
                throw new IllegalArgumentException("Números duplicados não são permitidos.");
            }
            numerosValidos.add(numero);
        }

        if (numerosValidos.size() < MIN_NUM_COUNT || numerosValidos.size() > MAX_NUM_COUNT) {
            throw new IllegalArgumentException("Número de números deve estar entre " + MIN_NUM_COUNT + " e " + MAX_NUM_COUNT + ".");
        }

        return new ArrayList<>(numerosValidos);
    }

    public static Set<Integer> sortearNumeros() {
        Set<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();

        while (numerosSorteados.size() < MIN_NUM_COUNT) {
            int numeroSorteado = random.nextInt(MAX_NUM) + 1;
            numerosSorteados.add(numeroSorteado);
        }

        return numerosSorteados;
    }

    public static int contarAcertos(List<Integer> numerosApostados, Set<Integer> numerosSorteados) {
        int totalAcertos = 0;
        for (Integer numero : numerosApostados) {
            if (numerosSorteados.contains(numero)) {
                totalAcertos++;
            }
        }
        return totalAcertos;
    }

    public static double calcularPremioTotal(int totalAcertos, double valorAposta) {
        if (totalAcertos == MIN_NUM_COUNT) {
            return valorAposta;
        }else
            if (totalAcertos == MIN_NUM_COUNT - 1) {
                 return valorAposta * 0.2;
        }else
            if (totalAcertos == MIN_NUM_COUNT - 2) {
                return valorAposta * 0.05;
             }
            return valorAposta;
    }
}



