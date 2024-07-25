public class HelloUniverse {
    public static void main(String[] args) {
        String str = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        int nbPlanet = 8;

        System.out.print(str);
        System.out.println(nbPlanet++);
        str = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.print(str);
        System.out.println(nbPlanet);
    }
}
