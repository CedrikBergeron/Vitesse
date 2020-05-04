package vitesse_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vitesse.modeles.parametres.Parametres;
import vitesse_client.controleurs.ControleurAccueil;
import vitesse_client.vues.VueParametres;
import vitesse_javafx.afficheurs.AfficheurParametresFX;
import vitesse_javafx.controleurs.ControleurAccueilFX;
import vitesse_javafx.controleurs.ControleurParametresFX;
import vitesse_javafx.vues.VueAccueilFX;
import vitesse_javafx.vues.VueParametresFX;


public class Principal extends Application {
	
	static {
		J.appel(Principal.class);
		
		Initialisateur.initialiser();
		
	}
	
	public static void main(String[] args) {
		J.appel(Principal.class);
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		DialogueModal.enregistreFenetrePrincipale(fenetrePrincipale);
		
		Scene scene = creerScenePrincipale();
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.show();
		
	}
	
	private Scene creerScenePrincipale() {
		J.appel(this);
		
		ChargeurDeVue<VueAccueilFX> chargeur;
		chargeur = new ChargeurDeVue<VueAccueilFX>("/fxml/accueil.xml", "translate.chaines", "/css/accueil.css");
		
		VueAccueilFX vue = chargeur.getVue();
		
		DoitEtre.nonNul(vue);
		
		FabriqueControleur.creerControleur(ControleurAccueilFX.class, vue);
		
		Scene scene = chargeur.nouvelleScene(600, 400);
		
		DoitEtre.nonNul(scene);
		
		return scene;
	}
	
	@Override
	public void stop() {
		J.appel(this);
		
	}
	
}