import java.util.List;

public class FuncionarioImplementacao implements IFuncionario {

    private Funcionario funcionario;

    public FuncionarioImplementacao(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return funcionario.obterDadosPessoais();
    }

    @Override
    public List<Float> obterSalario(Empresario empresario) {
        return funcionario.obterSalario(empresario);
    }
}
