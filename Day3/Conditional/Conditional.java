import java.io.Console;
import java.io.PrintStream;

public class Conditional{
  private Console console = System.console();
  // boolean debug;
  int difficulty = 5;
  Conditional(){ System.out.println("Main constructor"); }
  public void set_difficulty(int difficulty) { this.difficulty = difficulty; }
  public int generate_answer() { return 1+(int)Math.floor(Math.random() * difficulty); }
  public void init() {
    boolean con = true;
    Writer.say("Guess a number");
    int answer = generate_answer();
    while (true) {
      int guess;
      while(true){
        Writer.say("1 Through "+difficulty);
        String input = console.readLine();
        try { guess=Integer.parseInt(input); break; }
        catch(NumberFormatException e) { Writer.say("Invalid input"); }
      }
      // Check if you win
      if (guess == answer){
        Writer.say("**** You win  ****");
        try { Thread.sleep(1000); }
        catch(InterruptedException e) { }
        if(Interaction.choose(new String[]{"continue","Quit"}) == 1) {
          // continue
          set_difficulty(difficulty*2);
          answer = generate_answer();
          continue;
        }
        else { break; } // Quit
      }
      else { Writer.say("Your guess was to "+((guess < answer)?"low":"high")+"! "+"Answer: "+answer); }
    }
  }
  public static void clear_screen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  private static Conditional conditions = new Conditional();
  public static void main(String args[]) {
    conditions.init();
  }
}
