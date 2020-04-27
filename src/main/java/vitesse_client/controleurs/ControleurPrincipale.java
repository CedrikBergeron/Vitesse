package vitesse_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import vitesse.modeles.principale.Principale;
import vitesse.modeles.principale.PrincipaleLectureSeule;
import vitesse_client.afficheurs.AfficheurPrincipale;
import vitesse_client.vues.VuePrincipale;

public abstract class ControleurPrincipale<V extends VuePrincipale, A extends AfficheurPrincipale<V>> extends ControleurModeleVue<PrincipaleLectureSeule, Principale, V, A> {
	@Override
	protected void demarrer() {
		J.appel(this);
		
	}
}