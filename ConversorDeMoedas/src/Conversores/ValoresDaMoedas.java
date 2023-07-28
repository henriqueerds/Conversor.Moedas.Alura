package Conversores;

public class ValoresDaMoedas {
    public static double converterMoedas(String moedaOrigem, String moedaDestino, double valor) {
        // Lógica para conversão de moedas (exemplo simples, valores fictícios)
        // Note que esta lógica deve ser substituída pelas taxas de câmbio reais
        // para obter resultados precisos.
        switch (moedaOrigem) {
            case "Dólar":
                switch (moedaDestino) {
                    case "Euro":
                        return valor * 0.91; // Exemplo: 1 dólar = 0.85 euro
                    case "Libra Esterlina":
                        return valor * 0.78; // Exemplo: 1 dólar = 0.72 libra esterlina
                    case "Iene":
                        return valor * 139.01; // Exemplo: 1 dólar = 110.47 ienes
                    case "Real":
                        return valor * 4.74; // Exemplo: 1 dólar = 5.25 reais
                    case "Won Coreano":
                        return valor * 1272.17;
                }
                break;
            case "Euro":
                switch (moedaDestino) {
                    case "Dólar":
                        return valor * 1.1;
                    case "Libra Esterlina":
                        return valor * 0.86;
                    case "Iene":
                        return valor * 152.59;
                    case "Real":
                        return valor * 5.21;
                    case "Won Coreano":
                        return valor * 1410.15;
                }
                break;
            case "Libra Esterlina":
                switch (moedaDestino) {
                    case "Dólar":
                        return valor * 1.28;
                    case "Euro":
                        return valor * 1.19;
                    case "Iene":
                        return valor * 177.68;
                    case "Real":
                        return valor * 6.07;
                    case "Won Coreano":
                        return valor * 1643.25;
                }
                break;
            case "Iene":
                switch (moedaDestino) {
                    case "Dólar":
                        return valor * 0.0072;
                    case "Euro":
                        return valor * 0.0066;
                    case "Libra Esterlina":
                        return valor * 0.0056;
                    case "Real":
                        return valor * 0.034;
                    case "Won Coreano":
                        return valor * 9.25;
                }
                break;
            case "Real":
                switch (moedaDestino) {
                    case "Dólar":
                        return valor * 0.21;
                    case "Euro":
                        return valor * 0.19;
                    case "Libra Esterlina":
                        return valor * 0.16;
                    case "Iene":
                        return valor * 29.28;
                    case "Won Coreano":
                        return valor * 270.75;
                }
                break;
            case "Won Coreano":
                switch (moedaDestino) {
                    case "Dólar":
                        return valor * 0.00078;
                    case "Euro":
                        return valor * 0.00071;
                    case "Libra Esterlina":
                        return valor * 0.0000061;
                    case "Iene":
                        return valor * 0.11;
                    case "Real":
                        return valor * 0.0037;
                }
                break;
        }
        return valor; // Caso não haja conversão, retorna o mesmo valor
    }
}
