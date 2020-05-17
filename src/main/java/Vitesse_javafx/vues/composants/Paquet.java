package Vitesse_javafx.vues.composants;

import Vitesse_javafx.vues.composants.Carte.Rank;
import Vitesse_javafx.vues.composants.Carte.Suit;

public class Paquet {

    private Carte[] cards = new Carte[52];

    public Paquet() {
        refill();
    }

    public final void refill() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Carte(suit, rank);
            }
        }
    }

    public Carte drawCard() {
    	Carte card = null;
        while (card == null) {
            int index = (int)(Math.random()*cards.length);
            card = cards[index];
            cards[index] = null;
        }
        return card;
    }
}
