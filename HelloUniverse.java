public class HelloUniverse {
    public static void main(String[] args) {
        String str = "En %d, les planetes du systme solaire etaient au nombre de: %d ";
        int nbPlanet = 0;
        short annee = 2004;
        if (annee < 2006) {
            nbPlanet = 9;
        } else {
            nbPlanet = 8;
        }
        System.out.printf(str, annee, nbPlanet);
    }
}
