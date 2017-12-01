package control;

import java.util.ArrayList;

import model.BD;
import view.ViewExibeMusicas;
import view.ViewSolicitaLetra;

public class ControleMusicaPorLetra {
	
	//Atributo
	private BD bd;
	
	//Metodo contrutor
	public ControleMusicaPorLetra(BD bd) {
		this.bd = bd;
	}
	
	//Metodo para mostrar musica por letra
	public void motraMusicaPorLetra() {
		
		ViewSolicitaLetra vsl = new ViewSolicitaLetra();
		
		vsl.obterLetra();
		
		String letra = vsl.getLetra();
		
		
		ArrayList<String> mletra = this.bd.getMusicaPorLetra(letra.charAt(0));
		
		ViewExibeMusicas vem = new ViewExibeMusicas();
		
		vem.exibeMusicaPorLetra(mletra);
		
		
		
		
		
	}
	

}
