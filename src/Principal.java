public class Principal {
    public static void main(String[] args) {
        String eur = "EUR";
        String usd = "USD";
        String brl = "BRL";
        String cny = "CNY";

        ChamaApi chama = new ChamaApi();
        Menu meuMenu = new Menu();
        PaisesSuport suport = new PaisesSuport();

        boolean end = true;
        while (end){
            meuMenu.getMenu();
            var caso = meuMenu.getIntValor();

            meuMenu.getValor();
            var novoValor = meuMenu.getNextValor();

            switch (caso) {
                case 0:
                    meuMenu.getFinalizarText();
                    end = false;
                    break;
                case 1:
                    chama.getApi(usd, brl, novoValor);
                    break;
                case 2:
                    chama.getApi(usd, eur, novoValor);
                    break;
                case 3:
                    chama.getApi(usd, cny, novoValor);
                    break;
                case 4:
                    chama.getApi(brl, usd, novoValor);
                    break;
                case 5:
                    chama.getApi(brl, eur, novoValor);
                    break;
                case 6:
                    chama.getApi(brl, cny, novoValor);
                    break;
                case 7:
                    meuMenu.getExpandir();
                    var opcoes = meuMenu.getIntValor();
                    if (opcoes == 0){
                        suport.getTodosPaises();
                        System.out.println("Entrada 1: pais");
                        var moeda1 = meuMenu.getNextValor();
                        System.out.println("Entrada 2: pais");
                        var moeda2 = meuMenu.getNextValor();
                        chama.getApi(moeda1, moeda2, novoValor);
                    } else if (opcoes != 1 | opcoes != 0) {
                        System.out.println("Entrada 1: pais");
                        var moeda1 = meuMenu.getNextValor();
                        System.out.println("Entrada 2: pais");
                        var moeda2 = meuMenu.getNextValor();
                        chama.getApi(moeda1, moeda2, novoValor);
                    } else {
                        meuMenu.getInvalido();
                        meuMenu.getFinalizarText();
                        break;
                    }
                    break;
                default:
                    meuMenu.getInvalido();
                    break;
            }

            meuMenu.getFinalizar();
            var novaoperacao = meuMenu.getIntValor();

            if(novaoperacao == 0) {
                meuMenu.getFinalizarText();
                end = false;
            } else {
                meuMenu.getNovaOperacao();
            }
        }

    }
}
