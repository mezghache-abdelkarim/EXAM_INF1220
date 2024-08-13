public class LongueurChar {

  public static int longueurChar(String chaine) {
    // nom de l'université en minuscules pour ignorer la casse
    String universite = "université téluq";

    int longueur = 0;

    for (int i = 0; i < chaine.length(); i++) {
      char c = Character.toLowerCase(chaine.charAt(i));

      if (c != ' ') { // Ignorer les espaces vides

        if (universite.indexOf(c) != -1) {
          // Si le caractère est dans le nom de l'université, on compte double
          longueur += 2;
        } else {
          // Sinon, on compte normalement
          longueur += 1;
        }
      }
    }

    return longueur;
  }

  public static void main(String[] args) {
    String chaine = "Bonjour Université TÉLUQ";
    int longueur = longueurChar(chaine);
    System.out.println("La Longueur est de : " + longueur);
  }
}
