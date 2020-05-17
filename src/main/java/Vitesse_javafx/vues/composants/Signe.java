package Vitesse_javafx.vues.composants;

import java.util.HashMap;
import java.util.Map;

public enum Signe {
	COEUR(0, 'H'), 
	CARREAU(1, 'D'), 
	TREFLE(2, 'C'), 
	PIQUE(3, 'S');

	private int suitValue;
	private char suitCharacter;
	
	private final static Map<Character, Signe> suitMap = new HashMap<Character, Signe>(4, 1.0f);
	static {
		for(Signe suit : Signe.values()) {
			suitMap.put(suit.asChar(), suit);
		}
	}
	
	Signe(int value, char character) {
		this.suitValue = value;
		this.suitCharacter = character;
	}

	public int asInt() {
		return suitValue;
	}
	
	public char asChar() {
		return suitCharacter;
	}
	
	public static Signe fromChar(char suitChar) {
		return suitMap.get(suitChar);
	}
}
