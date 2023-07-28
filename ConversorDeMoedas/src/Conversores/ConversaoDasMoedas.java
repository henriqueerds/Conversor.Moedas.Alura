package Conversores;

import javax.swing.*;

public class ConversaoDasMoedas {
    public static void exibirDialogoConversorMoedas() {
        // Lista de moedas disponíveis para conversão
        String[] moedas = { "Dólar", "Euro", "Libra Esterlina", "Iene", "Real", "Won Coreano" };

        // Solicitando ao usuário a escolha das duas moedas para a conversão
        String moedaOrigem = (String) JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Selecione a moeda de origem:", // Mensagem
                "Conversor de Moedas", // Título da janela
                JOptionPane.PLAIN_MESSAGE, // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
                null, // Ícone personalizado (null indica nenhum ícone)
                moedas, // Array de opções
                moedas[0] // Opção selecionada por padrão
        );

        String moedaDestino = (String) JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Selecione a moeda de destino:", // Mensagem
                "Conversor de Moedas", // Título da janela
                JOptionPane.PLAIN_MESSAGE, // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
                null, // Ícone personalizado (null indica nenhum ícone)
                moedas, // Array de opções
                moedas[1] // Opção selecionada por padrão (diferente da primeira escolha)
        );

        // Solicitando ao usuário o valor a ser convertido
        String valorStr = JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Digite o valor de " + moedaOrigem + " que deseja converter em " + moedaDestino + ":", // Mensagem
                "Conversor de Moedas", // Título da janela
                JOptionPane.PLAIN_MESSAGE // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
        );

        // Verificando se o usuário digitou um valor válido (número)
        if (valorStr != null && !valorStr.isEmpty()) {
            try {
                double valor = Double.parseDouble(valorStr);
                double valorConvertido = ValoresDaMoedas.converterMoedas(moedaOrigem, moedaDestino, valor);
                JOptionPane.showMessageDialog(
                        null,
                        "O valor convertido de " + moedaOrigem + " para " + moedaDestino + " é: " + Simbolos.Moedas(moedaDestino)+ " " + valorConvertido,
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
