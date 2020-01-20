package electrics.industries;

public class Gearbox {

	private final static int decalageSuperieur = 2000;
	private final static int decalageInferieur = 500;
	private final static int pointMort = 0;
	private final static int nombreVitesseMax = 6;
	private final static int premierVitesse = 1;
	

    private int s = 0;
    private int e = 0;

    public void doit(int i) {
        if (s < pointMort) {
            // do nothing!
            e = i;
        }
        else {
        	
            if (s > pointMort) {
                if (i > decalageSuperieur) {
                    s++;
                } else if (i < decalageInferieur) {
                    s--;
                }
            }
            
            if (s > nombreVitesseMax) {
                s--;
            } 
            else if (s < premierVitesse) {
                s++;
            }
            e = i;
        }
    }

}