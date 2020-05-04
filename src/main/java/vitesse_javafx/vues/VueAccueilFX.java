package vitesse_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import vitesse_client.commandes.nouvelle_partie.NouvellePartiePourEnvoi;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametres;
import vitesse_client.commandes.ouvrir_parametres.OuvrirParametresPourEnvoi;
import vitesse_client.commandes.quitter.Quitter;
import vitesse_client.commandes.quitter.QuitterPourEnvoi;
import vitesse_client.vues.VueAccueil;
import static vitesse_javafx.Constantes.*;

public class VueAccueilFX implements VueAccueil, Initializable {
	
	@FXML
	MenuItem menuNouvellePartie, menuParametres, menuQuitter;
	
	@FXML
	VBox conteneurPartie;
	
	QuitterPourEnvoi quitterPourEnvoi;
	OuvrirParametresPourEnvoi ouvrirParametresPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		quitterPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(Quitter.class);
		ouvrirParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(OuvrirParametres.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		menuQuitter.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				quitterPourEnvoi.envoyerCommande();
			}
		});
		
		menuParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				ouvrirParametresPourEnvoi.envoyerCommande();
			}
		});
		
		menuNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				nouvellePartiePourEnvoi.envoyerCommande();
			}
		});
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
	}

	public VuePartieLocaleFX creerVuePartieLocale() {
		J.appel(this);

		ChargeurDeVue<VuePartieLocaleFX> chargeur = new ChargeurDeVue<VuePartieLocaleFX>("/fxml/partieLocale.xml",
						"translate.chaines",
						"/css/partieLocale.css");
		
		VuePartieLocaleFX vuePartieLocale = chargeur.getVue();
		
		Parent parent = chargeur.getParent();
		
		conteneurPartie.getChildren().clear();
		conteneurPartie.getChildren().add(parent);
		
		return vuePartieLocale;
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

}
