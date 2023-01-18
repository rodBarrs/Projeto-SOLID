public class PromocaoService {

    public void promover (Funcionario funcionario, boolean metaBatida) {

        if (cargo.GERENTE == funcionario.getCargo()) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo)

        } else {
            throw new ValidacaoException("Gerentes não podem ser promovidos")
        }
    }


}