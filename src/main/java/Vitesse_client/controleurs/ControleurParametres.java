package Vitesse_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import Vitesse.modeles.parametres.Parametres;
import Vitesse.modeles.parametres.ParametresLectureSeule;
import Vitesse_client.afficheurs.AfficheurParametres;
import Vitesse_client.commandes.choisir_choix.ChoisirChoix;
import Vitesse_client.commandes.choisir_choix.ChoisirChoixRecue;
import Vitesse_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres,
					       				     A extends AfficheurParametres<V>> 

					extends ControleurModeleVue<ParametresLectureSeule, 
											    Parametres, 
											    V, 
											    A> {
	

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(ChoisirChoix.class, new RecepteurCommandeMVC<ChoisirChoixRecue>() {

			@Override
			public void executerCommandeMVC(ChoisirChoixRecue commande) {
				J.appel(this);
				
				modele.choisirChoix(commande.getChoix());
			}
		});
	}

	@Override
	protected void demarrer() {
		J.appel(this);

	} 
}
