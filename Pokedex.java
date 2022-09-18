class Pokedex {

  private double evolution;
  private String type;

  //constructor 1
  public Pokedex(double evolution, String type) {
    this.evolution = evolution;
    this.type = type;
  }
	
	public double getEvolution() {
		return evolution;
	}
	public void setEvolution(double evolution) {
		this.evolution = evolution;
  }

  @Override
  public String toString() {
    return "Pokedex entry: " + this.type + ". Pokemon's evolution: " + this.evolution;
  }
  
}