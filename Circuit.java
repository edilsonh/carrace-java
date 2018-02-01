public class Circuit extends CarRace {
  private int turns;
  private int laps;

  public Circuit(int turns, int laps, int position, String name){
    super(position, name);
    this.turns = turns;
    this.laps = laps;
  }

  public String toString(){
    return "Race Type: Circuit, " + super.toString() + ", Number of turns: " + turns + ", Number of laps: " + laps;
  }

  public static void main(String[] args) {
    Circuit race = new Circuit(7, 5, 2, "Ed");
    String results = race.toString();
    System.out.println(results);
  }
}
