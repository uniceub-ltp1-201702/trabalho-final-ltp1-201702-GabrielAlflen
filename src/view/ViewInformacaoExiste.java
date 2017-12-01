package view;

import javax.swing.JOptionPane;

public class ViewInformacaoExiste {

	//Metodo para exibir mensagem de artista existente
	public void exibirMensagemInformacaoExiste() {
		JOptionPane.showMessageDialog(null, "Artista já existe!!", "Erro", JOptionPane.ERROR_MESSAGE);
	}
}
