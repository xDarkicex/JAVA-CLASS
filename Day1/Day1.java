import java.util.ArrayList;
import java.util.Arrays;
import java.io.Console;


public class Day1 {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  // public static final String ANSI_BOLD = "\u001B[1em";

  private static ArrayList<String> lines = new ArrayList<String>(Arrays.asList("\tYou stand at one end of the narrow bridge and tell the troll you refuse to play his riddle",
  "charging him with your simple woodsman's axe.  The troll, looking unsurprised, steps to the side batting away",
  "your charge as his large green hands grab you by the neck, snapping it like a twig.",
  "charging him with your simple woodsman's axe.  The troll, looking unsurprised, steps to the side batting away",
  "\tyour charge as his large green hands grab you by the neck, snapping it like a twig.",
  "Your flesh was savored with some nice Rhone region red wine by the Troll and a young female troll he was trying to impress with his"+" amateur culinary skills.  You have died, but the troll couple had lovely evening.",
  "\"Game over"));
  public static void main(String args[]){
    for(String s : lines) {
      try {
        for(char c : s.toCharArray()) {
          System.out.print(ANSI_RED+c+ANSI_RESET);
          Thread.sleep(100);
        }
        System.out.println();
        Thread.sleep(100);
      }
      catch(InterruptedException e) { }
    }
  }
}
