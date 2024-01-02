import java.util.List;
import java.util.Set;

public class Classe_Loteria {
    public double metodo(List<Integer> num, double valor) {
        List<Integer> numerosValidos = Loteria.validarNumeros(num);
        Set<Integer> numerosSorteados = Loteria.sortearNumeros();
        int totalAcertos = Loteria.contarAcertos(numerosValidos, numerosSorteados);
        return Loteria.calcularPremioTotal(totalAcertos, valor);
    }
}
