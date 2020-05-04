package vitesse_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.Erreur;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import vitesse_client.commandes.choisir_choix.NombreDeCartes;
import vitesse_client.commandes.choisir_choix.NombreDeCartesPourEnvoi;
import vitesse_client.vues.VueParametres;

public class VueParametresFX  implements VueParametres, Initializable {
	
	@FXML 
	private TextField choisirNombreDeCartes;

	@FXML 
	private Text afficherNombreDeCartes;
	
	private NombreDeCartesPourEnvoi commandeNombreDeCartes;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(choisirNombreDeCartes);
		DoitEtre.nonNul(afficherNombreDeCartes);
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		commandeNombreDeCartes = FabriqueCommande.obtenirCommandePourEnvoi(NombreDeCartes.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		choisirNombreDeCartes.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				try {
					
					int nombre = Integer.valueOf(choisirNombreDeCartes.getText());

					commandeNombreDeCartes.setNombreDeCartes(nombre);
					commandeNombreDeCartes.envoyerCommande();
					

				}catch(Exception e) {
					
					Erreur.avertissement("pas un nombre: " + choisirNombreDeCartes.getText());
					
				}
				
			}
		});
		
		
	}


	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}

	@Override
	public void afficherNombreDeCartes(int nombreDeCartes) {
		J.appel(this);
		
		afficherNombreDeCartes.setText(String.valueOf(nombreDeCartes));
	}

}
