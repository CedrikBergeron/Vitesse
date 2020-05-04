package vitesse_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import vitesse.modeles.partie_locale.PartieLocale;
import vitesse.modeles.partie_locale.PartieLocaleLectureSeule;
import vitesse_client.afficheurs.AfficheurPartieLocale;
import vitesse_client.commandes.jouer_coup.JouerCoup;
import vitesse_client.commandes.jouer_coup.JouerCoupRecue;
import vitesse_client.vues.VuePartieLocale;

public abstract class ControleurPartieLocale<V extends VuePartieLocale,
					       				     A extends AfficheurPartieLocale<V>> 

					extends ControleurModeleVue<PartieLocaleLectureSeule, 
											    PartieLocale, 
											    V, 
											    A> {
	
	@Override
	protected void demarrer() {
		J.appel(this);
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(JouerCoup.class, new RecepteurCommandeMVC<JouerCoupRecue>() {
			@Override
			public void executerCommandeMVC(JouerCoupRecue commande) {
				J.appel(this);
				
				modele.jouerCoup(commande.getInfoCoup());
			}
		});
	} 
}
