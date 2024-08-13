package Q5;

// Classe BasesDeDonnees qui hérite de Cours
class BasesDeDonnees extends Cours {
  public BasesDeDonnees() {
      super("INF 1250", "Introduction aux bases de données");
  }

  @Override
  public void description() {
      System.out.println("Ce cours introduit les concepts de base des bases de données.");
  }
}