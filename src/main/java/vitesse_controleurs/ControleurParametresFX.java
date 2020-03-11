package vitesse_controleurs;

import commun.debogage.J;
import vitesse.afficheurs.AfficheurParametresFX;
import vitesse_client.controleurs.ControleurParametres;
import vitesse_client.vues.VueParametresFX;

public class ControleurParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX>{

	@Override
	protected void installerReceptionCommandes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

}
