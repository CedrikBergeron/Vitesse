package Vitesse_javafx.vues.composants;

import java.util.HashMap;
import java.util.Map;


public enum Numero {
	DEUX(2, '2'), 
	TROIS(3, '3'), 
	QUATTRE(4, '4'), 
	CINQ(5, '5'), 
	SIX(6,'6'), 
	SEPT(7, '7'),
	HUIT(8, '8'),
	NEUF(9, '9'), 
	DIX(10, 'T'), 
	VALET(11,'J'), 
	DAME(12, 'Q'), 
	ROI(13, 'K'), 
	ACE(14, 'A');

	private int cardValue;
	private char rankCharacter;
	private final static Map<Character, Numero> rankMap = 
			new HashMap<Character, Numero>(Numero.values().length + 1, 1.0f);
	static {
		for(Numero rank : Numero.values()) {
			rankMap.put(rank.asChar(), rank);
		}
	}
	
	Numero(int value, char character) {
		this.cardValue = value;
		this.rankCharacter = character;
	}

	public int asInt() {
		return cardValue;
	}

	public char asChar() {
		return rankCharacter;
	}
	
	public static Numero fromChar(char rankChar) {
		return rankMap.get(rankChar);
	}
}
