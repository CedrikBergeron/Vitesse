package Vitesse.modeles.partie_locale;

import java.util.ArrayList;
import java.util.List;

import Vitesse.enumerations.Choix;
import Vitesse.modeles.parametres.Parametres;
import Vitesse.modeles.parametres.ParametresLectureSeule;
import commun.debogage.J;
import commun.modeles.Modele;

public class PartieLocale extends Modele<PartieLocaleLectureSeule> implements PartieLocaleLectureSeule {
	
	
	
	private int cartes = 52;
	
	public void jouerCoup(int infoCoup) {
		J.appel(this);
		
		cartes--;
	}

	@Override
	public int getCartesRestantes() {
		
		return cartes;
	}
	
}
