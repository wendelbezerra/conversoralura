import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApi {
        public Endereco novaBusca(String base, String target, String valor) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/20ca88d578895167f8e28d9d/pair/" +
                        base +
                        "/" +
                        target +
                        "/" +
                        valor ))
                .build();

        HttpResponse<String> response;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Endereco.class);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Algo está errado.");
            }
        }
}