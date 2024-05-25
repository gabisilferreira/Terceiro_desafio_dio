public class Iphone {
    public static void main(String[] args) {
        telefone cell = null;
        String funcaoEscolhida = "ReproduzirMusica";
        
        if (funcaoEscolhida.equals("Telefonar")) {
            cell = new Telefonar();
        } else if (funcaoEscolhida.equals("ReproduzirMusica")) {
            cell = new ReproduzirMusica();
        } else if (funcaoEscolhida.equals("NavegarInternet")) {
            cell = new NavegarInternet();
        }
        
        if (cell != null) {
            cell.executarFuncao();
        }
    }
}

