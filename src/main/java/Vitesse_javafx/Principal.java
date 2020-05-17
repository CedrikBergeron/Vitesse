package Vitesse_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;

import static Vitesse_javafx.Constantes.*;

import java.io.FileInputStream;

import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import Vitesse_javafx.controleurs.ControleurAccueilFX;
import Vitesse_javafx.controleurs.ControleurPagesFX;
import Vitesse_javafx.vues.VueAccueilFX;
import Vitesse_javafx.vues.VuePagesFX;

public class Principal extends Application {

	static {

		Initialisateur.initialiser();
		
		J.appel(Principal.class);
	}
	
	public static void main(String[] args) {
		J.appel(Principal.class);
		launch(args);
	}

	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		DialogueModal.enregistreFenetrePrincipale(fenetrePrincipale);

		ChargeurDeVue<VuePagesFX> chargeur = creerChargeurPages();

		installerSceneAccueil(fenetrePrincipale, chargeur);

		instancierMVCPages(chargeur);
		
		fenetrePrincipale.show();
	}


	private void instancierMVCPages(ChargeurDeVue<VuePagesFX> chargeur) {
		J.appel(this);

		VuePagesFX vue = chargeur.getVue();
		
		DoitEtre.nonNul(vue);

		FabriqueControleur.creerControleur(ControleurPagesFX.class, 
	   									   vue);
	}

	private ChargeurDeVue<VuePagesFX> creerChargeurPages() {
		J.appel(this);

		ChargeurDeVue<VuePagesFX> chargeur = new ChargeurDeVue<VuePagesFX>(CHEMIN_PAGES_FXML,
						CHEMIN_CHAINES,
						CHEMIN_PAGES_CSS);

		return chargeur;
	}

	private void installerSceneAccueil(Stage fenetrePrincipale, 
			                           ChargeurDeVue<VuePagesFX> chargeur) {
		J.appel(this);

		Scene scene = chargeur.nouvelleScene(50, 50, 2);
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.setWidth(Constantes.LARGEUR);
		fenetrePrincipale.setHeight(Constantes.HAUTEUR);
		fenetrePrincipale.setFullScreen(false);
	}
}

