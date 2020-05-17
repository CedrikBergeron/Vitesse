package Vitesse_javafx.controleurs;

import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.commandes.FabriqueCommande;
import commun_client.commandes.RecepteurCommande;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Vitesse.modeles.parametres.Parametres;
import Vitesse.modeles.parametres.ParametresLectureSeule;
import Vitesse.modeles.partie_locale.PartieLocale;
import Vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import Vitesse_client.commandes.nouvelle_partie.NouvellePartieRecue;
import Vitesse_client.commandes.ouvrir_parametres.OuvrirParametres;
import Vitesse_client.commandes.ouvrir_parametres.OuvrirParametresRecue;
import Vitesse_client.commandes.quitter.Quitter;
import Vitesse_client.commandes.quitter.QuitterRecue;
import Vitesse_client.commandes.retour_accueil.RetourAccueil;
import Vitesse_client.commandes.retour_accueil.RetourAccueilRecue;
import Vitesse_client.controleurs.ControleurAccueil;
import Vitesse_javafx.afficheurs.AfficheurParametresFX;
import Vitesse_javafx.afficheurs.AfficheurPartieLocaleFX;
import Vitesse_javafx.vues.VuePartieLocaleFX;
import Vitesse_javafx.vues.VueAccueilFX;
import Vitesse_javafx.vues.VueParametresFX;

import static Vitesse_javafx.Constantes.*;

public class ControleurAccueilFX extends ControleurAccueil<VueAccueilFX> {
	
	
	private Scene sceneParametres;
	private Stage dialogueParametres;
	
	
	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}
	
	private void ouvrirParametres() {
		J.appel(this);

		dialogueParametres = DialogueModal.ouvrirDialogueModal(sceneParametres);
	}

	private void fermerParametres() {
		J.appel(this);
		
		if(dialogueParametres != null) {
			
			dialogueParametres.close();
		}
	}

	@Override
	protected void demarrer() {
		J.appel(this);
	}
}
