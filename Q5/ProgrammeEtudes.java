package Q5;

// classe principale pour tester le polymorphisme
public class ProgrammeEtudes {
  public static void main(String[] args) {
      // création des instances de cours
      Cours cours1 = new GenieLogiciel();
      Cours cours2 = new Algorithmique();
      Cours cours3 = new BasesDeDonnees();
      Cours cours4 = new Programmation();

      // utilisation du polymorphisme pour afficher les détails de chaque cours
      Cours[] programme = {cours1, cours2, cours3, cours4};

      System.out.println("Nom: mezghahce abdel karim ");
      System.out.println("Numéro étudiant : 24225052");

      System.out.println("Programme d'etude : Certificat en informatique appliquée\n");
      
      System.out.println("les cours suivie : \n");


      for (Cours cours : programme) {
          cours.afficherDetails();
          System.out.println();
      }
  }
}
