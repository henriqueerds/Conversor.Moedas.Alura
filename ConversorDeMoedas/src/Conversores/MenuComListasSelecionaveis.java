package Conversores;

import javax.swing.*;

public class MenuComListasSelecionaveis {

    public static void exibirMenuComListas() {
        String[] opcoesListagem = { "Conversor de Moedas", "Conversor de Temperatura" };

        // Criando a caixa com a listagem
        String itemSelecionado = (String) JOptionPane.showInputDialog(
                null, // Componente pai (null indica o centro da tela)
                "Escolha uma opção:", // Mensagem
                "Menu", // Título da janela
                JOptionPane.PLAIN_MESSAGE, // Tipo de ícone (PLAIN_MESSAGE não exibe ícone)
                null, // Ícone personalizado (null indica nenhum ícone)
                opcoesListagem, // Array de opções
                opcoesListagem[0] // Opção selecionada por padrão
        );

        // Verificando a seleção do usuário
        if (itemSelecionado == "Conversor de Moedas") {
            // Seguindo para a conversão das moedas
            ConversaoDasMoedas.exibirDialogoConversorMoedas();
            }
        if (itemSelecionado == "Conversor de Temperatura") {
            // Seguindo para a conversão da temperatura
            ConversorTemperatura.exibirDialogoConversorTemperatura();
        }
    }
}
