package Vitesse_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import Vitesse_client.commandes.nouvelle_partie.NouvellePartie;
import Vitesse_client.commandes.nouvelle_partie.NouvellePartiePourEnvoi;
import Vitesse_client.commandes.ouvrir_parametres.OuvrirParametres;
import Vitesse_client.commandes.ouvrir_parametres.OuvrirParametresPourEnvoi;
import Vitesse_client.commandes.quitter.Quitter;
import Vitesse_client.commandes.quitter.QuitterPourEnvoi;
import Vitesse_client.vues.VueAccueil;
import static Vitesse_javafx.Constantes.*;

public class VueAccueilFX implements VueAccueil, Initializable {
	
	@FXML
	Button boutonNouvellePartie, boutonOuvrirParametres;
	
	OuvrirParametresPourEnvoi ouvrirParametresPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(boutonNouvellePartie);
		DoitEtre.nonNul(boutonOuvrirParametres);
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		ouvrirParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(OuvrirParametres.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		boutonOuvrirParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				ouvrirParametresPourEnvoi.envoyerCommande();
			}
		});
		
		boutonNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				nouvellePartiePourEnvoi.envoyerCommande();
			}
		});
	}



	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

}
