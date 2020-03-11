package vitesse.afficheurs;

import commun.debogage.J;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse_client.afficheurs.AfficheurParametres;
import vitesse_client.vues.VueParametresFX;

public class AfficheurParametresFX extends AfficheurParametres<VueParametresFX>{

	@Override
	public void initialiserAffichage(ParametresLectureSeule modeleLectureSeule, VueParametresFX vue) {
		J.appel(this);
		
	}

	@Override
	public void rafraichirAffichage(ParametresLectureSeule modeleLectureSeule, VueParametresFX vue) {
		// TODO Auto-generated method stub
		
	}

}
