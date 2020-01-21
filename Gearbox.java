package electrics.industries;

public class Gearbox {

	private final static int decalageSuperieur = 2000;
	private final static int decalageInferieur = 500;
	private final static int pointMort = 0;
	private final static int nombreVitesseMax = 6;
	private final static int premierVitesse = 1;

	private int vitesse = 0;
	private int regime = 0;

	public void doit(int regimeactuelle) {
		regime = regimeactuelle;
		if(vitesseAIncrementer()){
			incrementVitesse();
		}
		else if(vitesseADecrementer()){
			retrograderVitesse();
		}

	}
	/*
	* Methode pour faire passer la boite à la vitesse superieur
	*/
	public void incrementVitesse(){
		vitesse++;
	}

	/*
	* Methode pour faire rétrograder la boite de vitesse
	*/
	public void retrograderVitesse(){
		vitesse--;
	}

	/*
	* Veirfie s'il faut incrementer la boite de vitesse
	*/
	public boolean vitesseAIncrementer() {
		return ((vitesse > pointMort && regime > decalageSuperieur) || (vitesse < premierVitesse));
	}

	/*
	* Verifie s'il faut rétrograder la boite de vitesse
	*/
	public boolean vitesseADecrementer() {
		return ((vitesse > pointMort && regime < decalageInferieur) || vitesse > nombreVitesseMax);
	} }
	}

}
