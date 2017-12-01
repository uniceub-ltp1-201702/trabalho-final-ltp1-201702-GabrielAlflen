package control;

import model.BD;
import view.ViewExibeMusicas;
import view.ViewSolicitaNomeMusica;

public class ControleMusicaPorNome {
	
	//Atributo
	private BD bd;
	
	//Metodo construtor
	public ControleMusicaPorNome(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para mostrar musica por nome
	public void musicaPorNome() {
		
		
		ViewSolicitaNomeMusica vsn = new ViewSolicitaNomeMusica();
		
		vsn.obterMusica();
		
		String musica = vsn.getMusica();
		
		ViewExibeMusicas vem = new ViewExibeMusicas();
		
		vem.exibeMusicaPorNome(this.bd.getMusicaPorNome(musica));
		
		
		
	}
	

}
