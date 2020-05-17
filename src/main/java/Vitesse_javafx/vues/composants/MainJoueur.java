package Vitesse_javafx.vues.composants;

import Vitesse_javafx.vues.composants.Carte.Rank;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class MainJoueur {

    private ObservableList<Node> cards;
    private SimpleIntegerProperty value = new SimpleIntegerProperty(0);

    private int aces = 0;

    public MainJoueur(ObservableList<Node> cards) {
        this.cards = cards;
    }
/*
    public void takeCard(Carte card) {
        cards.add(card);

        if (card.rank == Rank.ACE) {
            aces++;
        }

        if (value.get() + card.value > 21 && aces > 0) {
            value.set(value.get() + card.value - 10);    //then count ace as '1' not '11'
            aces--;
        }
        else {
            value.set(value.get() + card.value);
        }
    }
*/
    public void reset() {
        cards.clear();
        value.set(0);
        aces = 0;
    }

    public SimpleIntegerProperty valueProperty() {
        return value;
    }
}