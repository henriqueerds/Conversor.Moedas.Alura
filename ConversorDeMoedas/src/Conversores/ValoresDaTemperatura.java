package Conversores;

public class ValoresDaTemperatura {
    public static double converterTemperatura(String temperaturaOrigem, double valor) {
        // Lógica para conversão de temperatura (exemplo simples, valores fictícios)
        switch (temperaturaOrigem) {
            case "Celsius":
                switch (temperaturaOrigem){
                    case "Fahrenheit":
                        return (valor * 9/5) +32; // Exemplo: Fahrenheit para Celsius
                    case "Kelvin":
                        return valor + 273.15; // Exemplo: Kelvin para Celsius
                    default:
                        return valor; // Se for a mesma temperatura, retorna o mesmo valor
                }
            case "Fahrenheit":
                switch (temperaturaOrigem) {
                    case "Celsius":
                        return (valor - 32) * 5/9;
                    case "Kelvin":
                        return (valor - 32) *5/9 + 273.15;
                    default:
                        return valor; // Se for a mesma temperatura, retorna o mesmo valor
                }
            case "Kelvin":
                switch (temperaturaOrigem) {
                    case "Celsius":
                        return valor - 273.15;
                    case "Fahrenheit":
                        return (valor - 273.15) * 9/5 + 32;
                    default:
                        return valor; // Se for a mesma temperatura, retorna o mesmo valor
                }
        }
        return valor;
    }
}
