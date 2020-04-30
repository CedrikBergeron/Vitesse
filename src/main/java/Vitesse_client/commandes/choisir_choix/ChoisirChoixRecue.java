package Vitesse_client.commandes.choisir_choix;

import commun_client.commandes.CommandeRecue;
import Vitesse.enumerations.Choix;

public interface ChoisirChoixRecue extends CommandeRecue {
	
	Choix getChoix();

}
