package vitesse.modeles.parametres;

import java.util.Random;

import commun.debogage.J;
import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule{
	private int nbCartesJeu = 52 * (new Random().nextInt(4));

	@Override
	public int getNbCartesJeu() {
		J.appel(this);
		
		return nbCartesJeu;
	}
}
