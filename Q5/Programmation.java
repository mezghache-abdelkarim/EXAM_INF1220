package Q5;

// Classe Programmation qui hérite de Cours
class Programmation extends Cours {
  public Programmation() {
      super("INF 1220", "Introduction à la programmation");
  }

  @Override
  public void description() {
      System.out.println("Ce cours enseigne les bases de la programmation en Java.");
  }
}