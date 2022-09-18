import java.util.*;

class Pokemon {

  private String name;
  private String activity;
  private ArrayList<Pokedex> pokedexs = new ArrayList <Pokedex>();

  //constructor 2
  public Pokemon(String name, ArrayList<Pokedex> pokedex) {
    this.name = name;
    this.pokedexs = pokedex;
  }
	
	public String getName() {
		return name;
	}
  public String getActivity() {
		return activity;
	}
  
	public void setName(String name) {
		this.name = name;
  }
  public void setActivity(String activity) {
		this.activity = activity;
  }
  public void addPokedex(Pokedex pokedex) {
		pokedexs.add(pokedex);
  }

  @Override
  public String toString() {
    return "[Pokemon's name = " + name + ", Pokemon's activity = " + activity + "]";
  }

  public void printPokedex() {
		double total = 0;
    
    
    for(Pokedex i : pokedexs){

      total  += i.getEvolution();

      System.out.println(i.toString());
      
    }

    System.out.println(total);
    
  }
  
}