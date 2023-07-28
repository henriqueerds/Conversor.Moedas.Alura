package Conversores;

import javax.swing.JOptionPane;

public class MenuDeFinalizacao {

    boolean continuarPrograma = true;

    public void executarMenuDeFinalizacao() {
        int resposta = JOptionPane.showConfirmDialog(
                null, "Deseja continuar no programa?", "Continuar",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE
        );

        if (resposta == JOptionPane.YES_OPTION) {
            MenuComListasSelecionaveis.exibirMenuComListas();
            // Continuar no programa e exibir o menu principal novamente
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(
                    null, "Programa finalizado.", "Finalizado", JOptionPane.INFORMATION_MESSAGE
            );
            continuarPrograma = false;
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(
                    null, "Programa concluído.", "Concluído", JOptionPane.INFORMATION_MESSAGE
            );
            continuarPrograma = false;
        }
    }
}

