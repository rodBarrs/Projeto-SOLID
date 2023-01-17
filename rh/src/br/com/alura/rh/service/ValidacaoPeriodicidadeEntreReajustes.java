public class ValidacaoPercentualReajuste implements validacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnits.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste < 6){
            throw new ValidacaoException ("Intervalo entre reajustes deve ser de no mínimo de 6 meses")
        }
    }

}