package vitesse_client.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class VuePrincipaleFX<ConteneurCartes01, ConteneurEntetes>  implements VuePrincipale, Initializable {
	@FXML
	private ConteneurEntetes conteneurEntetes;
	
	@FXML
	private ConteneurCartes01 conteneurCartes01;

	@Override
	public void obtenirCommandesPourEnvoi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(conteneurEntetes);
		
		DoitEtre.nonNul(conteneurCartes01);
	}

	@Override
	public void creerCartes(int nbCartesJeu) {
		J.appel(this);
		
		conteneurEntetes.creerEntetes();//je ne sais pas ou est supposée être cette classe dans mon projet
		
		conteneurCartes01.creerCartes();//je ne sais pas ou est supposée être cette classe dans mon projet
	}

}
