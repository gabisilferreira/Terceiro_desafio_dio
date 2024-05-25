public class ReproduzirMusica extends telefone {
    @Override
    public void executarFuncao() {
        listaMusicas();
    }

    public void listaMusicas() {
        entrarapp();
        System.out.println("Suas opções de músicas salvas");
        escolherMusica();
        aumentarVolume();
        diminuirVolume();
    }

    public void escolherMusica() {
        System.out.println("Escolha sua música");
    }

    public void aumentarVolume() {
        System.out.println("Aumentar volume");
    }

    public void diminuirVolume() {
        System.out.println("Diminuir volume");
    }

    private void entrarapp() {
        System.out.println("Entrando no app de músicas");
    }
}


