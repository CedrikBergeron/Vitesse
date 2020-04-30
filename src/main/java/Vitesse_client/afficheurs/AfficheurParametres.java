package Vitesse_client.afficheurs;

import commun.debogage.J;
import commun_client.mvc.Afficheur;
import Vitesse.modeles.parametres.ParametresLectureSeule;
import Vitesse_client.vues.VueParametres;

public abstract class AfficheurParametres<V extends VueParametres> 

                            extends Afficheur<ParametresLectureSeule, 
                                              V> {

	@Override
	public void initialiserAffichage(ParametresLectureSeule modeleLectureSeule, VueParametres vue) {
		J.appel(this);
		
		vue.afficherChoix(modeleLectureSeule.getChoixUsager());
	}

	@Override
	public void rafraichirAffichage(ParametresLectureSeule modeleLectureSeule, VueParametres vue) {
		J.appel(this);

		vue.afficherChoix(modeleLectureSeule.getChoixUsager());
	}

}
