package vitesse_javafx.vues.composants;

import commun.debogage.J;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.NamedArg;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class animationButton extends Button {
	
	private Timeline animationSurvol = new Timeline();
	
	public animationButton(@NamedArg("url") String url) {

		super(url);
		J.appel(this);
		
		creerAnimation();
		
		animationSurvol.setCycleCount(-1);
		animationSurvol.playFromStart();
		
		installerListeners();
	}
	
	private void installerListeners() {
		
		J.appel(this);;
		
		this.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
			
				J.appel(this);
				
				animationSurvol.playFromStart();
			}
		});
		
		this.setOnMouseExited(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				J.appel(this);
				animationSurvol.stop();
				animationButton.this.setOpacity(1);
			}
		});
	}
	
	private void creerAnimation() {
		
		J.appel(this);
		
		double delaiMilisecondes = 1200;
		double opaciteNormal = 1.0;
		double opaciteBasse = 0.3;
		
		animationSurvol.getKeyFrames().add(new KeyFrame(Duration.ZERO, new KeyValue(opacityProperty(), opaciteNormal)));
		
		animationSurvol.getKeyFrames().add(new KeyFrame(new Duration(delaiMilisecondes), new KeyValue(opacityProperty(), opaciteBasse)));
		
		animationSurvol.getKeyFrames().add(new KeyFrame(new Duration(delaiMilisecondes *2), new KeyValue(opacityProperty(), opaciteNormal)));
		
		
	}
}
