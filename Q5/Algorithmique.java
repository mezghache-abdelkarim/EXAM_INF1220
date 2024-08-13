package Q5;

// Classe Algorithmique qui hérite de Cours
class Algorithmique extends Cours {
  public Algorithmique() {
      super("INF 1425", "Algorithmique et structures de données");
  }

  @Override
  public void description() {
      System.out.println("Ce cours explore les algorithmes et les structures de données fondamentales.");
  }
}
