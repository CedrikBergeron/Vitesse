package Vitesse_javafx.vues.composants;

import java.io.InputStream;

import commun.debogage.J;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public abstract class ImageAjustable extends HBox {
	protected ImageView imageView;
	
	public ImageAjustable(String url) {
		super();
		J.appel(this);
		
		InputStream streamImage = ImageAjustable.class.getResourceAsStream(url);
		
		Image image = new Image(streamImage);
		
		imageView = new ImageView(image);
		
		this.getChildren().add(imageView);
		
		this.setAlignment(Pos.CENTER);
		
		
	}
}
