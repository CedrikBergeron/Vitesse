package vitesse;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vitesse.afficheurs.AfficheurParametresFX;
import vitesse.modeles.parametres.Parametres;
import vitesse_client.afficheurs.AfficheurParametres;
import vitesse_client.vues.VueParametres;
import vitesse_controleurs.ControleurParametresFX;


public class Principal extends Application {
	
	static {
		J.appel(Principal.class);
		
		ChargeurDeVue<VueParametres> chargeur;
		
		chargeur = new ChargeurDeVue<VueParametres>("../ressources/fxml/Parametres.xml", "je sais pas", "../ressources/css/style.css");
		
		VueParametres vue = chargeur.getVue();
		
		DoitEtre.nonNul(vue);
		
		Parametres param = new Parametres();
		
		AfficheurParametresFX afficheur = new AfficheurParametresFX();
		
		FabriqueControleur.creerControleur(ControleurParametresFX.class, param, vue, afficheur);
		
		Initialisateur.initialiser();
		
	}
	
	public static void main(String[] args) {
		J.appel(Principal.class);
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel(this);
		
		Scene scene = creerScenePrincipale();
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.show();
		
	}
	
	private Scene creerScenePrincipale() {
		J.appel(this);
		
		ChargeurDeVue chargeur = new ChargeurDeVue(Constantes.CHEMIN_PARTIE_LOCALE_FXML,Constantes.CHEMIN_CHAINES,Constantes.CHEMIN_PARTIE_LOCALE_CSS);
		
		Scene scene = chargeur.nouvelleScene(600, 400);
		
		DoitEtre.nonNul(scene);
		
		return scene;
	}
	
	@Override
	public void stop() {
		J.appel(this);
		
	}
	
}