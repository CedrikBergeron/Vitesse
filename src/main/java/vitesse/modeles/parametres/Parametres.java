package vitesse.modeles.parametres;

import commun.debogage.J;
import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule{
	private int hauteurGrille = 10;

	@Override
	public int getHauteurGrille() {
		J.appel(this);
		
		return hauteurGrille;
	}
}
