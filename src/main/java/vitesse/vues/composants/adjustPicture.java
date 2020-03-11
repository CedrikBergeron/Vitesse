package vitesse.vues.composants;



import java.io.InputStream;

import commun.debogage.J;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public abstract class adjustPicture extends HBox {
	protected ImageView imageView;
	
	private double largeurInitialeConteneur;
	private double hauteurInitialeConteneur;
	
	public adjustPicture(String url) {
		
		super();
		J.appel(this);
		
		InputStream streamImage = adjustPicture.class.getResourceAsStream(url);
		
		Image image = new Image(streamImage);
		
		imageView = new ImageView(image);
		
		this.getChildren().add(imageView);
		
		this.setAlignment(Pos.CENTER);
		
		installerListenerLargeur();
		installerListenerHauteur();
		
	}
	
	private void ajusterTailleImage() {
		
		J.appel(this);
		
		double largeurCourante = this.getWidth();
		double hauteurCourante = this.getHeight();
		
		if (largeurCourante < hauteurCourante) {
			
			setScaleXY(largeurCourante/largeurInitialeConteneur);
			
			
		}
		else {
			
			setScaleXY (hauteurCourante/hauteurInitialeConteneur);
			
		}
		
		
	}
	
	private void setScaleXY(double facteurTaille) {
		
		
		J.appel(this);
		
		this.imageView.setScaleX(facteurTaille);
		this.imageView.setScaleY(facteurTaille);
		
	
	}
	
	private void installerListenerLargeur() {
		
		J.appel(this);
		
		this.widthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

				double ancienneLargeur =(double) oldValue;
				double nouvelleLargeur = (double) newValue;
				
				if(ancienneLargeur ==0) {
					
					largeurInitialeConteneur = nouvelleLargeur;
					
				} else {
					
					ajusterTailleImage();
					
					
				}
			}
		});
		
		
	}
	
	private void installerListenerHauteur() {
		
		
		J.appel(this);
		
		this.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				J.appel(this);
				
				double ancienneHauteur = (double) oldValue;
				double nouvelleHauteur = (double) newValue;
				
				if (ancienneHauteur == 0) {
					
					hauteurInitialeConteneur = nouvelleHauteur;
					
					
				} else {
					
					ajusterTailleImage();
					
				}
			}
		});
		
		
	}
}
