package Vitesse_javafx.vues;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import Vitesse_client.commandes.jouer_coup.JouerCoup;
import Vitesse_client.commandes.jouer_coup.JouerCoupPourEnvoi;
import Vitesse_client.commandes.retour_accueil.RetourAccueil;
import Vitesse_client.commandes.retour_accueil.RetourAccueilPourEnvoi;
import Vitesse_client.vues.VuePartieLocale;
import Vitesse_javafx.vues.composants.MainJoueur;
import Vitesse_javafx.vues.composants.Paquet;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	
	@FXML
	private Text texteTmpPartieLocale, texteNombreCoups;
	
	
	@FXML
	private Button jouerCarte1, jouerCarte2, jouerCarte3, jouerCarte4, jouerCarte5, boutonRetour;
	
	private JouerCoupPourEnvoi jouerCoup;

	private RetourAccueilPourEnvoi retourAccueil;
	
	public Rectangle carte01, carte02, carte03, carte04, carte05, carte06;

	Image imgcarte01 = new Image(randomCardSource());
	Image imgcarte02 = new Image(randomCardSource());
	Image imgcarte03 = new Image(randomCardSource());
	Image imgcarte04 = new Image(randomCardSource());
	Image imgcarte05 = new Image(randomCardSource());
	Image imgcarte06 = new Image(randomCardSource());
	

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
		carte01.setFill(new ImagePattern(imgcarte01));
		carte02.setFill(new ImagePattern(imgcarte02));
		carte03.setFill(new ImagePattern(imgcarte03));
		carte04.setFill(new ImagePattern(imgcarte04));
		carte05.setFill(new ImagePattern(imgcarte05));
		carte06.setFill(new ImagePattern(imgcarte06));
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
	
	public String randomCardSource() {
		int signeTemp=(int)(Math.random() * (52));
		String signe = String.valueOf(signeTemp);
		String lienImage = "/images/" + signe + ".jpg";
		return lienImage;
	}

}
