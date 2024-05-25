public class Telefonar extends telefone {
    @Override
    public void executarFuncao() {
        ligarNumero();
    }

    public void ligarNumero() {
        contatos();
        salvarHistoricoLigacao();
        discarNumero();
        desligar();
    }

    public void discarNumero() {
        System.out.println("Digite o n° que deseja ligar");
    }

    public void desligar() {
        System.out.println("Encerrando ligação");
    }

    private void contatos() {
        System.out.println("Abrir app de contatos");
    }

    private void salvarHistoricoLigacao() {
        System.out.println("Salvando o histórico de ligação");
    }
}

