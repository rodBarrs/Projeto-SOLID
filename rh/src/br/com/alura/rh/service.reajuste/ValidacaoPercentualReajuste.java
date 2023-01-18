public class ValidacaoPercentualReajuste implements validacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecima salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }

}