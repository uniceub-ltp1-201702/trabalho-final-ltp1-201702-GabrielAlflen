package control;

import java.util.ArrayList;

import model.BD;
import view.ViewExibeMusicas;
import view.ViewSolicitaArtista;

public class ControleMusicasPorArtista {
	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleMusicasPorArtista(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para mostrar musicas de um artista
	public void mostrarMusicaPorArtista() {
		
		ViewSolicitaArtista vsa = new ViewSolicitaArtista();
		
		vsa.obterArtista();
		
		String artista = vsa.getArtista();
		
		ArrayList<String> musicas = this.bd.getMusicasPorArtista(artista);
		
		ViewExibeMusicas vem = new ViewExibeMusicas();
		
		vem.exibeMusicas(musicas);
		
	}
	
	
	
	

}
