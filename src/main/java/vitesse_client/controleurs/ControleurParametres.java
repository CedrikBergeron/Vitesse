package vitesse_client.controleurs;

import commun_client.mvc.controleurs.ControleurModeleVue;
import vitesse.modeles.parametres.Parametres;
import vitesse.modeles.parametres.ParametresLectureSeule;
import vitesse_client.afficheurs.AfficheurParametres;
import vitesse_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>> extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A> {

}