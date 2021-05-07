package fr.francois.roulette;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Pistolet pistolet = new Pistolet();
		
		System.out.println(Arrays.toString(pistolet.charger()));
		
		pistolet.tirer(0);
	}

}
