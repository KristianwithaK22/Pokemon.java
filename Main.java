// Pokemon Evolving Coding Skills
//
//so far - objects, classes and constructors
//3 classes, check
//uses colleciton structure arraylist
//the extra evolution stage output should come form loop through collection
//4 pillars are inheritance, overriding, encapsulation using private get/set, and Abstract class
//Exception was getfifthelement for final question

//USE 45 FONT IN SETTINGS/JSON

import java.util.*;
import java.util.Scanner;

class Main {

  public static final String ANSI_RESET = "\u001B[0m";
  
  public static final String ANSI_GREEN_BACKGROUND
        = "\u001B[42m";
  
  public static final String ANSI_WHITE = "\u001B[30m";

  public static final String ANSI_WHITE_BACKGROUND
        = "\u001B[47m";

  public static void main(String[] args) {

    ArrayList<Pokedex> pokedex = new ArrayList <Pokedex>();

    Pokemon patient = new Pokemon("Tasty", pokedex);
    
     patient.setActivity("trying not to water chop his keyboard in half to compete his code against his friends");

     System.out.println(ANSI_GREEN_BACKGROUND + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + ANSI_RESET);
     System.out.println("Accessing files......");
     Scanner sc = new Scanner(System.in);
     System.out.println("\n\n\nPress \033[3mENTER\033[0m to open (Project Dewott) ->");
     String enter = sc.nextLine();
     
     System.out.println("\n>>");
    

     System.out.println(patient);
    
    
    Pokedex pokedexs = new Pokedex(2, "Dewott");
    
    //method 1
    patient.addPokedex(pokedexs);

    //method 2, uses loop from bottom of pokemon.java
    patient.printPokedex();

    
    System.out.println("");
    
    ArrayList<Dewott> nature = new ArrayList<Dewott>();
    Tasty tasty = new Tasty("\033[3m Tasty the MISCHIEVOUS Otter \033[0m");
        tasty.name = "\033[3m Tasty the MISCHIEVOUS Otter\033[0m";
    nature.add(tasty);
    for (Dewott dewott : nature){
      //method 3
      dewott.walk();
    }

    TastysBattleCry tastysBattleCry = new TastysBattleCry();
    //method 4
    tastysBattleCry.sound();


    
    
    
    System.out.println("");
    System.out.println(ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
    System.out.println("Hi, can you please enter your name? My name is Tasty, and I've been    trying to test my Scanner to accept user input of 4 HOURS.\n");
    String name = sc.nextLine();
    System.out.println("");
    System.out.println("\n\n\n\n\n\n\n\n" + ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
    System.out.println("Hi " + name + ", it is nice to meet you.");

    //attempting iftrue do loop here
    boolean isBad = true;
    do{
    System.out.println("");
    System.out.println(ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
    System.out.println("Please answer 1 for YES\n           or 2 for NO\n if you think I, Tasty the mischievous otter, OTTER HAVE a raise in    treats hehehe...\n");
    
    int choice = sc.nextInt();
    
    //STILL DONT UNDERSTAND HOW TO CATCH EXCEPTION FOR INT CHOICE RECEIVING A STRING but at least it runs lol
      try{
    switch(choice) {
  //entered a isBADfalseortrue into every case and default if neeeded the backspace
  case 1: 
  isBad = false;
  System.out.println("\n\n\n\n\n\n\n\n\n\n");
    System.out.println(ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
  System.out.println("Thank you, fellow citizen -u- \n\n");
          break;
  case 2:
  isBad = false; 
  System.out.println("\n\n\n\n\n\n\n\n\n\n");
    System.out.println(ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
  System.out.println("Well we'll SEE who gets treats then... -n-\n\n");
          break;
  default: 
  throw new InputMismatchException();
  
  
  
        
  }
}//try above switch bracket
catch(InputMismatchException e)
{
  isBad = true;
  System.out.println("\n\n\n\n\n\n\n\n\n\n");
  System.out.println(ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
System.out.println("That's not a yes or no, bucko.");
        break;
}

}while(isBad);//do completing bracket if need to erase is here!
    
  System.out.println("");
    System.out.println(ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");  
  System.out.println("Welp, I guess I better get back to my daily viewing of Rango. I sure   hope nobody enters the OutOfMemory.kill() method by pressing 1 again......");
  int killchoice = sc.nextInt();
    
    switch(killchoice) {
      case 1: int[] array = {1, 2, 3, 4, 5};
          try{
            getFifthElement(array);
          } 
          catch (Exception ex) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n\n\n" + ANSI_WHITE + ANSI_WHITE_BACKGROUND + "Tasty" + ANSI_RESET + "");
            System.out.println("GOTCHA HAHAHA!\n *call ended\n\n\n\n\n\n\n\n");
            //put print exception error in comments because it was more included to represent catching a case error rather than needing to tell the reader the error I chose
            //ex.printStackTrace();
          }
          break;
      default: System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nnothing happened...you are a very responsible person\n\n\n\n\n\n\n\n");
          break;
        
      }
    
    }
  public static void getFifthElement(int[] array) {
     System.out.println(array[5]);
  }
}