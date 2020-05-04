package vitesse_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse_client.vues.VueParametres;
import vitesse_javafx.vues.VueParametresFX;

public abstract class AfficheurParametres<V extends VueParametres> extends Afficheur<ParametresLectureSeule, V>{
	
	@Override
	public void initialiserAffichage(ParametresLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);
		
		vue.afficherNombreDeCartes(modeleLectureSeule.getNbCartesJeu());
	}

	@Override
	public void rafraichirAffichage(ParametresLectureSeule modeleLectureSeule, V vue) {
		J.appel(this);

		vue.afficherNombreDeCartes(modeleLectureSeule.getNbCartesJeu());
	}
}
