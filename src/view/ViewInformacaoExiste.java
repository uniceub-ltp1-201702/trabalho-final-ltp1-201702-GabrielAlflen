package view;

import javax.swing.JOptionPane;

public class ViewInformacaoExiste {

	//Metodo para exibir mensagem de artista existente
	public void exibirMensagemInformacaoExiste() {
		JOptionPane.showMessageDialog(null, "Artista j� existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
}
