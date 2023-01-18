public class Terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;
    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal) {
        super(nome, cpf, cargo, salario);
    }
    @Override
    public void promover(Cargo novoCargo){

    }
    @Override
    public void atualizarSalario(BigDecimal novoSalario){

    }

    pubic String getEmpresa() {
        return empresa;
    }

    publico void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


}