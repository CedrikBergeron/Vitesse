package Vitesse_javafx.vues;

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
import Vitesse_client.commandes.jouer_coup.JouerCoup;
import Vitesse_client.commandes.jouer_coup.JouerCoupPourEnvoi;
import Vitesse_client.commandes.retour_accueil.RetourAccueil;
import Vitesse_client.commandes.retour_accueil.RetourAccueilPourEnvoi;
import Vitesse_client.vues.VuePartieLocale;
import javafx.fxml.Initializable;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	
	@FXML
	private Text texteTmpPartieLocale, texteNombreCoups;
	
	@FXML
	private Button jouerCarte1, jouerCarte2, jouerCarte3, jouerCarte4, jouerCarte5, boutonRetour;
	
	private JouerCoupPourEnvoi jouerCoup;

	private RetourAccueilPourEnvoi retourAccueil;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(texteTmpPartieLocale);
		DoitEtre.nonNul(texteNombreCoups);
		DoitEtre.nonNul(jouerCarte1);
		DoitEtre.nonNul(jouerCarte2);
		DoitEtre.nonNul(jouerCarte3);
		DoitEtre.nonNul(jouerCarte4);
		DoitEtre.nonNul(jouerCarte5);
		DoitEtre.nonNul(boutonRetour);
	} 

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		jouerCoup = FabriqueCommande.obtenirCommandePourEnvoi(JouerCoup.class);

		retourAccueil = FabriqueCommande.obtenirCommandePourEnvoi(RetourAccueil.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		jouerCarte1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				jouerCoup.setInfoCoup(extraireInfoCoup());
				
				jouerCoup.envoyerCommande();
			}
		});
		
		jouerCarte2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				jouerCoup.setInfoCoup(extraireInfoCoup());
				
				jouerCoup.envoyerCommande();
			}
		});
		
		jouerCarte3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				jouerCoup.setInfoCoup(extraireInfoCoup());
				
				jouerCoup.envoyerCommande();
			}
		});
		
		jouerCarte4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				jouerCoup.setInfoCoup(extraireInfoCoup());
				
				jouerCoup.envoyerCommande();
			}
		});
		
		jouerCarte5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				jouerCoup.setInfoCoup(extraireInfoCoup());
				
				jouerCoup.envoyerCommande();
			}
		});

		boutonRetour.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				retourAccueil.envoyerCommande();
			}
		});
	}

	private int extraireInfoCoup() {
		J.appel(this);

		return (new Random()).nextInt(3);
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

	@Override
	public void afficherNombreCoups(int nombreCoups) {
		J.appel(this);
		
		texteNombreCoups.setText(String.valueOf(nombreCoups));
	}

}
