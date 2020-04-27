package vitesse_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import vitesse.modeles.principale.PrincipaleLectureSeule;
import vitesse_client.vues.VuePrincipale;
import vitesse_client.vues.VuePrincipaleFX;

public abstract class AfficheurPrincipale<V extends VuePrincipale> extends Afficheur<PrincipaleLectureSeule, V>{
	
	@Override
	public void initialiserAffichage(PrincipaleLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		
		int nbCartesJeu = modeleLectureSeule.getNbCartesJeu();
		
		vue.creerCartes(nbCartesJeu);
		
	}
}
