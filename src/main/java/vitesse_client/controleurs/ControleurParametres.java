package vitesse_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import vitesse.modeles.parametres.Parametres;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse_client.afficheurs.AfficheurParametres;
import vitesse_client.commandes.choisir_choix.NombreDeCartes;
import vitesse_client.commandes.choisir_choix.NombreDeCartesRecue;
import vitesse_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>> extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A> {

	@Override
	protected void demarrer() {
		J.appel(this);
		
	}


	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(NombreDeCartes.class, new RecepteurCommandeMVC<NombreDeCartesRecue>() {
			@Override
			public void executerCommandeMVC(NombreDeCartesRecue commande) {
				J.appel(this);
				
				modele.changerNombreDeCartes(commande.getNombreDeCartes());
			}
		});
	}
}