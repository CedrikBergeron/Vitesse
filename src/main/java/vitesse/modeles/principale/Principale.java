package vitesse.modeles.principale;

import java.util.Random;

import commun.debogage.J;
import commun.modeles.Modele;

public class Principale extends Modele<PrincipaleLectureSeule> implements PrincipaleLectureSeule{
	private int nbCartesJeu = 52 * (new Random().nextInt(4));

	@Override
	public int getNbCartesJeu() {
		J.appel(this);
		
		return nbCartesJeu;
	}
}
