package vitesse_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse_client.vues.VueParametres;
import vitesse_client.vues.VueParametresFX;

public abstract class AfficheurParametres<V extends VueParametres> extends Afficheur<ParametresLectureSeule, V>{
	
	@Override
	public void initialiserAffichage(ParametresLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		
		int nbCartesJeu = modeleLectureSeule.getNbCartesJeu();
		
		vue.creerCartes(nbCartesJeu);
		
	}
}
