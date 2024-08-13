package Q5;

// Classe GénieLogiciel qui hérite de Cours
class GenieLogiciel extends Cours {
  public GenieLogiciel() {
      super("INF 1410", "Génie logiciel");
  }

  @Override
  public void description() {
      System.out.println("Ce cours couvre les principes et les pratiques du génie logiciel.");
  }
}
