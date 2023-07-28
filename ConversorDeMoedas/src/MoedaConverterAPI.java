import jdk.internal.access.JavaNetUriAccess;
import jdk.internal.icu.lang.UCharacterDirection;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class MoedaConverterAPI {

    // URL da API que fornece as taxas de câmbio
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";

    /*public static void main(String[] args) {
        try {
            double taxaDolarParaReal = obterTaxaDeCambio("BRL");
            double taxaDolarParaLibraEsterlina = obterTaxaDeCambio("GBP");
            double taxaDolarParaIene = obterTaxaDeCambio("JPY");
            double taxaDolarParaEuro = obterTaxaDeCambio("EUR");

            System.out.println("Taxa de conversão de Dólar para Real: " + taxaDolarParaReal);
            System.out.println("Taxa de conversão de Dólar para Libra Esterlina: " + taxaDolarParaLibraEsterlina);
            System.out.println("Taxa de conversão de Dólar para Iene: " + taxaDolarParaIene);
            System.out.println("Taxa de conversão de Dólar para Euro: " + taxaDolarParaEuro);

        } catch (IOException e) {
            System.err.println("Erro ao obter as taxas de câmbio: " + e.getMessage());
        }
    }

    public static <HttpGet, HttpEntity, ObjectMapper, JsonNode> double obterTaxaDeCambio(String moeda) throws IOException {
        JavaNetUriAccess HttpClientBuilder = null;
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(API_URL);

        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            UCharacterDirection EntityUtils;
            String jsonResult = EntityUtils.toString(entity);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonResult);
            return rootNode.path("rates").path(moeda).asDouble();
        }

        return 0.0;
    }*/
}
