package Vitesse_javafx.vues;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
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
	private Button boutonRetour, boutonBruler;
	
	private JouerCoupPourEnvoi jouerCoup;

	private RetourAccueilPourEnvoi retourAccueil;
	
	public Rectangle carte01, carte02, carte03, carte04, carte05, carte06;
	
	private int numc1 = randomCard();
	private int numc2 = randomCard();
	private int numc3 = randomCard();
	private int numc4 = randomCard();
	private int numc5 = randomCard();
	
	private int carteCentrale = 99;
	
	private static ArrayList<Integer> carteUtilise = new ArrayList<Integer>();
	int nombreCartes = 0;

	Image imgcarte01 = new Image(intToStringImg(numc1));
	Image imgcarte02 = new Image(intToStringImg(numc2));
	Image imgcarte03 = new Image(intToStringImg(numc3));
	Image imgcarte04 = new Image(intToStringImg(numc4));
	Image imgcarte05 = new Image(intToStringImg(numc5));
	Image imgcarte06 = new Image("images/Gray_back.jpg");
	
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(texteTmpPartieLocale);
		DoitEtre.nonNul(texteNombreCoups);
		DoitEtre.nonNul(boutonRetour);
		DoitEtre.nonNul(boutonBruler);
		
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
		
		carte01.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				J.appel(this);
				
				if(nombreCartes != 52 && verifierCarteJouable(numc1)) {
					jouerCoup.setInfoCoup(numc1);
					
					imgcarte06 = new Image(intToStringImg(numc1));
					
					carte06.setFill(new ImagePattern(imgcarte06));
					
					carteCentrale = numc1;
					
					if(nombreCartes < 52) {
						numc1 = randomCard();
						
						imgcarte01 = new Image(intToStringImg(numc1));
					
						carte01.setFill(new ImagePattern(imgcarte01));
						
						jouerCoup.envoyerCommande();
					} else {
						imgcarte01 = new Image("images/Gray_back.jpg");
						
						carte01.setFill(new ImagePattern(imgcarte01));
						
						jouerCoup.envoyerCommande();
					}
					
					
					System.out.println(carteCentrale);
					System.out.println(numc1);
				}
			}
		});
		
		carte02.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				J.appel(this);

				if(nombreCartes != 52 && verifierCarteJouable(numc2)) {
					jouerCoup.setInfoCoup(numc2);
					
					imgcarte06 = new Image(intToStringImg(numc2));
					
					carte06.setFill(new ImagePattern(imgcarte06));
					
					carteCentrale = numc2;

					if(nombreCartes < 52) {
						numc2 = randomCard();
						
						imgcarte02 = new Image(intToStringImg(numc2));
					
						carte02.setFill(new ImagePattern(imgcarte02));
						
						jouerCoup.envoyerCommande();
					} else {
						imgcarte02 = new Image("images/Gray_back.jpg");
						
						carte02.setFill(new ImagePattern(imgcarte02));
						
						jouerCoup.envoyerCommande();
					}
				}
			}
		});
		
		carte03.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				J.appel(this);
				
				if(nombreCartes != 52 && verifierCarteJouable(numc3)) {
					jouerCoup.setInfoCoup(numc3);
					
					imgcarte06 = new Image(intToStringImg(numc3));
					
					carte06.setFill(new ImagePattern(imgcarte06));
					
					carteCentrale = numc3;

					if(nombreCartes < 53) {
						numc3 = randomCard();
						
						imgcarte03 = new Image(intToStringImg(numc3));
					
						carte03.setFill(new ImagePattern(imgcarte03));
						
						jouerCoup.envoyerCommande();
					} else {
						imgcarte03 = new Image("images/Gray_back.jpg");
						
						carte03.setFill(new ImagePattern(imgcarte03));
						
						jouerCoup.envoyerCommande();
					}
				}
			}
		});
		
		carte04.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				J.appel(this);
				
				if(nombreCartes != 52 && verifierCarteJouable(numc4)) {
					jouerCoup.setInfoCoup(numc4);
					
					imgcarte06 = new Image(intToStringImg(numc4));
					
					carte06.setFill(new ImagePattern(imgcarte06));
					
					carteCentrale = numc4;
					
					if(nombreCartes < 54) {
						numc4 = randomCard();
						
						imgcarte04 = new Image(intToStringImg(numc4));
					
						carte04.setFill(new ImagePattern(imgcarte04));
						
						jouerCoup.envoyerCommande();
					} else {
						imgcarte04 = new Image("images/Gray_back.jpg");
						
						carte04.setFill(new ImagePattern(imgcarte04));
						
						jouerCoup.envoyerCommande();
					}
				}
			}
		});
		
		carte05.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				J.appel(this);
								
				if(nombreCartes != 52 && verifierCarteJouable(numc5)) {
					jouerCoup.setInfoCoup(numc5);
					
					imgcarte06 = new Image(intToStringImg(numc5));
					
					carte06.setFill(new ImagePattern(imgcarte06));
					
					carteCentrale = numc5;
					
					if(nombreCartes < 55) {
						numc5 = randomCard();
						
						imgcarte05 = new Image(intToStringImg(numc5));
					
						carte05.setFill(new ImagePattern(imgcarte05));
						
						jouerCoup.envoyerCommande();
					} else {
						imgcarte05 = new Image("images/Gray_back.jpg");
						
						carte05.setFill(new ImagePattern(imgcarte05));
						
						jouerCoup.envoyerCommande();
					}
				}
			}
		});

		boutonRetour.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				retourAccueil.envoyerCommande();
			}
		});
		
		boutonBruler.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				numc5 = randomCard();
				
				imgcarte05 = new Image(intToStringImg(numc5));
			
				carte05.setFill(new ImagePattern(imgcarte05));
				
				jouerCoup.envoyerCommande();
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
		
		texteNombreCoups.setText(String.valueOf(nombreCoups - 5));
	}
	
	public String intToStringImg(int signeTemp) {
		String signe = String.valueOf(signeTemp);
		String lienImage = "/images/" + signe + ".jpg";
		return lienImage;
	}
	
	public int randomCard() {
		int temp;
		do {
			temp = (int)(Math.random() * (52));
		} while (carteUtilise.contains(temp));
		
		carteUtilise.add(temp);
		nombreCartes++;
		return temp;
	}
	
	public boolean verifierCarteJouable(int carte) {
		boolean proximite = false;
		
		if(0 <= carte && carte <= 12) {
			if(carte - 1 == carteCentrale || carte + 12 == carteCentrale || carte + 25 == carteCentrale || carte + 38 == carteCentrale || carteCentrale == 99) {
				System.out.println("carte trefle vers bas");
				proximite = true;
			} else if (carte + 1 == carteCentrale || carte + 14 == carteCentrale || carte + 27 == carteCentrale || carte + 40 == carteCentrale) {
				proximite = true;
				System.out.println("carte trefle vers haut");
			}
		} else if(13 <= carte && carte <= 25) {
			if(carte - 1 == carteCentrale || carte + 12 == carteCentrale || carte + 25 == carteCentrale || carte - 14 == carteCentrale || carteCentrale == 99) {
				System.out.println("carte carreau vers bas");
				proximite = true;
			} else if (carte + 1 == carteCentrale || carte + 14 == carteCentrale || carte -12 == carteCentrale || carte + 27 == carteCentrale) {
				System.out.println("carte carreau vers haut");
				proximite = true;
			}
		} else if(26 <= carte && carte <= 38) {
			if(carte - 1 == carteCentrale || carte + 12 == carteCentrale || carte -27 == carteCentrale || carte -14 == carteCentrale || carteCentrale == 99) {
				System.out.println("carte coeur vers bas");
				proximite = true;
			} else if (carte + 1 == carteCentrale || carte - 37 == carteCentrale || carte -12 == carteCentrale || carte -25 == carteCentrale) {
				System.out.println("carte coeur vers haut");
				proximite = true;
			}
		} else {
			if(carte - 1 == carteCentrale || carte -40 == carteCentrale || carte -27 == carteCentrale || carte -14 == carteCentrale || carteCentrale == 99) {
				System.out.println("carte pique vers bas");
				proximite = true;
			} else if (carte + 1 == carteCentrale || carte -12 == carteCentrale || carte - 25 == carteCentrale || carte -38 == carteCentrale) {
				System.out.println("carte pique vers haut");
				proximite = true;
			} 
		}
		if(!proximite) {
			System.out.println("Fail");
			System.out.println("Carte Principale : " + carteCentrale);
			System.out.println("Carte Jouée: " + carte);
		}
		return proximite;
	}

}
