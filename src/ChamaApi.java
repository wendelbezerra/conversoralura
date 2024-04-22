import java.io.IOException;

public class ChamaApi {
    ConversorApi converter = new ConversorApi();
    public void getApi(String moeda1, String moeda2, String valor) {
        try {
            Endereco usd_brl = converter.novaBusca(moeda1, moeda2, valor);
            usd_brl.setQtd(valor);
            System.out.println(usd_brl);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.salvaJson(usd_brl);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }

}
