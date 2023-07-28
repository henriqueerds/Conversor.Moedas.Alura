package Conversores;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

    public static void exibirDialogoConversorTemperatura() {
        // Lista de temperaturas disponíveis para conversão
        String[] temperaturas = { "Celsius", "Fahrenheit", "Kelvin" };

        // Solicitando ao usuário a escolha da temperatura de origem
        String temperaturaOrigem = (String) JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Selecione a temperatura de origem:", // Mensagem
                "Conversor de Temperatura", // Título da janela
                JOptionPane.PLAIN_MESSAGE, // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
                null, // Ícone personalizado (null indica nenhum ícone)
                temperaturas, // Array de opções
                temperaturas[0] // Opção selecionada por padrão
        );

        String temperaturaDestino = (String) JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Selecione a temperatura a ser convertida:", // Mensagem
                "Conversor de Temperatura", // Título da janela
                JOptionPane.PLAIN_MESSAGE, // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
                null, // Ícone personalizado (null indica nenhum ícone)
                temperaturas, // Array de opções
                temperaturas[0] // Opção selecionada por padrão
        );

        // Solicitando ao usuário a temperatura a ser convertida
        String valorStr = JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Digite o valor em " + temperaturaOrigem + " que deseja converter em " + temperaturaDestino, // Mensagem
                "Conversor de Temperatura", // Título da janela
                JOptionPane.PLAIN_MESSAGE // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
        );

        // Verificando se o usuário digitou um valor válido (número)
        if (valorStr != null && !valorStr.isEmpty()) {
            try {
                double valor = Double.parseDouble(valorStr);
                double valorConvertido = ValoresDaTemperatura.converterTemperatura(temperaturaOrigem, valor);
                JOptionPane.showMessageDialog(
                        null,
                        "O valor convertido é: " + valorConvertido + " "+ Simbolos.Temperatura(temperaturaDestino),
                        "Resultado da Conversão",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Digite um valor numérico válido.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
        MenuDeFinalizacao menu = new MenuDeFinalizacao();
        menu.executarMenuDeFinalizacao();
    }
}

