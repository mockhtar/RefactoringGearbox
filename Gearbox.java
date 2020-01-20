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
        if (vitesse < pointMort) {
            // do nothing!
        	regime = regimeactuelle;
        }
        else {
        	
            if (vitesse > pointMort) {
                if (regimeactuelle > decalageSuperieur) {
                	vitesse++;
                } else if (regimeactuelle < decalageInferieur) {
                	vitesse--;
                }
            }
            
            if (vitesse > nombreVitesseMax) {
            	vitesse--;
            } 
            else if (vitesse < premierVitesse) {
            	vitesse++;
            }
            regime = regimeactuelle;
        }
    }

}