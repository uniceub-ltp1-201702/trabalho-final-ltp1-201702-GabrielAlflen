package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	
	//Atributo
	private String opcao;
	
	// Metodo para exibir uma lista de opções
	public String getOpcao(){
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma opção:\n" + 
				"1 - Cadastrar Artista\n" +
				"2 - Cadastrar Musica\n" +	
				"3 - Musicas de um determinado artista\n" +
				"4 - Buscar musica\n" +
				"5 - Buscar musica por letra\n" +
				"6 - Excluir Artista\n" +
				"7 - Excluir Musica\n" +
				"8 - Sair");
		
		return this.opcao;
	}

}
