public class CarRace {
  private String name;
  private int position;

  public CarRace(int position, String name){
    this.position = position;
    this.name = name;
  }

  public String toString() {
    return "Name: " + name + ", Finish Position: " + position;
  }
}
