package Conversores;

public class Simbolos {
    public static String Temperatura (String temperaturaDestino) {
        switch (temperaturaDestino) {
            case "Celsius":
                return "ºC";
            case "Fahrenheit":
                return "ºF";
            case "Kelvin":
                return "K";
        }
        return temperaturaDestino;
    }

    public static String Moedas (String moedaDestino){
        switch (moedaDestino) {
            case "Dólar":
                return "$";
            case "Euro":
                return "€";
            case "Libra Esterlina":
                return "£";
            case "Iene":
                return "¥";
            case "Real":
                return "R$";
            case "Won Coreano":
                return "₩";
        }
        return moedaDestino;
    }
}
