public class HelloUniverse {
    public static void main(String[] args) {
        Planete planete = new Planete();
        Planete mercure = new Planete();
        Planete venus = new Planete();
        Planete terre = new Planete();
        Planete mars = new Planete();

        mercure.nom = "Mercure";
        mercure.matiere = "tellurique";
        mercure.diametre = 4880;

        venus.nom = "Venus";
        venus.matiere = mercure.matiere;
        venus.diametre = 12100;

        terre.nom = "Terre";
        terre.matiere = mercure.matiere;
        terre.diametre = 12756;

        mars.nom = "Mars";
        mars.matiere = mercure.matiere;
        mars.diametre = 6792;

        System.out.println(mars.nom + " est une planete " + mars.matiere + " avec un diametre de " + mars.diametre + " kilometres");
        System.out.println(planete.nom + " est une planete " + planete.matiere + " avec un diametre de " + planete.diametre + " kilometres");
    }
}
