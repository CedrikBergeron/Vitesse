package vitesse_javafx.vues;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import vitesse_client.commandes.jouer_coup.JouerCoup;
import vitesse_client.commandes.jouer_coup.JouerCoupPourEnvoi;
import vitesse_client.vues.VuePartieLocale;
import javafx.fxml.Initializable;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	
	// TODO: ajouter ConteneurEntete.java à Git
	//@FXML
	//private ConteneurEntetes conteneurEntetes;
	
	// TODO: ajouter ConteneurCartes.java à Git
	//@FXML
	//private ConteneurCartes01 conteneurCartes01;
	
	private JouerCoupPourEnvoi jouerCoup;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);

		// TODO: ajouter ConteneurEntete.java à Git
		//DoitEtre.nonNul(conteneurEntetes);

		// TODO: ajouter ConteneurCartes.java à Git
		//DoitEtre.nonNul(conteneurCartes01);
		
	} 

	@Override
	public void creerCartes(int nbCartesJeu) {
		J.appel(this);
		
		// TODO: ajouter ces fichiers à Git
		//conteneurEntetes.creerEntetes();
		//conteneurCartes01.creerCartes();
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		jouerCoup = FabriqueCommande.obtenirCommandePourEnvoi(JouerCoup.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}


}
