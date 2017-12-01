package view;

import javax.swing.JOptionPane;

public class ViewInformacaoExiste {

	//Metodo para exibir mensagem de artista existente
	public void exibirMensagemInformacaoExiste() {
		JOptionPane.showMessageDialog(null, "Artista já existente!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
}
