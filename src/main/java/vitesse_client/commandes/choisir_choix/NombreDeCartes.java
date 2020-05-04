package vitesse_client.commandes.choisir_choix;

import commun.debogage.J;
import commun_client.commandes.Commande;

public class NombreDeCartes extends Commande<NombreDeCartesPourEnvoi, NombreDeCartesRecue>
	                      implements NombreDeCartesPourEnvoi, NombreDeCartesRecue {
	
	private int nombreDeCartes;
	
	@Override
	public int getNombreDeCartes() {
		J.appel(this);

		return nombreDeCartes;
	}

	@Override
	public void setNombreDeCartes(int nombreDeCartes) {
		J.appel(this);

		this.nombreDeCartes = nombreDeCartes;
	}
}
