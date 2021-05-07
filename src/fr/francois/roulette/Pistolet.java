package fr.francois.roulette;

import java.util.Random;

public class Pistolet {
	
	boolean[] barillet = new boolean[8];

	public Pistolet() {
		super();
		
	}

	public boolean[] getBarillet() {
		return barillet;
	}

	public void setBarillet(boolean[] barillet) {
		this.barillet = barillet;
	}
	/**
	 * Charge le pistoler
	 * @return boolean
	 */
	public boolean[] charger() {
		
        int rand = new Random().nextInt(7);
        
        barillet[rand] = true;
        
		return barillet;
		
	}
	/**
	 * Charge le pistoler
	 * affiche si le joueur est mort ou vivant
	 */
	public void tirer(int nb) {
		
		boolean bn = barillet[nb];
		if(bn) {
			System.out.println("Tu est mort!");
		}else {
			System.out.println("Tu est est en vie!");
		}
	}
}
