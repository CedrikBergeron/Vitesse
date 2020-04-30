package Vitesse_client.controleurs;

import commun_client.mvc.controleurs.ControleurVue;
import Vitesse_client.vues.VueAccueil;
import Vitesse_client.vues.VuePages;

public abstract class ControleurPages<V extends VuePages> extends ControleurVue<V> {}
