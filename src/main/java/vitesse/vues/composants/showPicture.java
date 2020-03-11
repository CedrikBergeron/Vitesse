package vitesse.vues.composants;

import commun.debogage.J;
import javafx.beans.NamedArg;

public class showPicture extends adjustPicture {
	public showPicture(@NamedArg("url") String url) {
		
		super(url);
		J.appel(this);
		
	}
}
