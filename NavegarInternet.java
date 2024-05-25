public class NavegarInternet extends telefone {
    @Override
    public void executarFuncao() {
        abrirbrowser();
    }

    public void abrirbrowser() {
        validarConectadoInternet();
        salvarHistoricoPesquisa();
        pesquisar();
    }

    public void pesquisar() {
        System.out.println("O que deseja pesquisar?");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHistoricoPesquisa() {
        System.out.println("Salvando o histórico de pesquisa");
    }
}
