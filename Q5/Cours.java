package Q5;

// Classe abstraite Cours
abstract class Cours {
  protected String code;
  protected String titre;

  public Cours(String code, String titre) {
      this.code = code;
      this.titre = titre;
  }

  // méthode abstraite
  public abstract void description();

  // méthode pour afficher les détails du cours
  public void afficherDetails() {
      System.out.println("Code: " + code);
      System.out.println("Titre: " + titre);
      description();
  }
}