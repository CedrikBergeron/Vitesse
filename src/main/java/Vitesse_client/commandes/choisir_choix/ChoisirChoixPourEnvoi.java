package Vitesse_client.commandes.choisir_choix;

import commun_client.commandes.CommandePourEnvoi;
import Vitesse.enumerations.Choix;

public interface ChoisirChoixPourEnvoi extends CommandePourEnvoi {
	
	void setChoix(Choix choix);

}
