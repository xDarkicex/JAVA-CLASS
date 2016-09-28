import java.io.Console;
import java.io.PrintStream;
public class Looping{
  public Console console=System.console();
  int difficulty = 5;
  Looping(){ System.out.println("Looping constructor"); }
  public void set_difficulty(int difficulty) { this.difficulty = difficulty; }
  public int gen_answer(){ return 1+(int)Math.floor(Math.random() * difficulty); }
  public void init(){
    int answer=gen_answer();
    while(true){
      int guess;
      while(true){
        System.out.println("guess 1-"+difficulty);
        String input=console.readLine();
        try { guess=Integer.parseInt(input); break; }
        catch(NumberFormatException e) { System.out.println("Invalid input"); }
      }
      if(guess == answer){
        System.out.println("WIN");
        if(Interaction.choose(new String[]{"continue","Quit"}) == 1) {
          answer=gen_answer();
          difficulty = difficulty*2;
          continue;
        }
        else { break; }
      } else if(guess < answer){
        System.out.println("TO LOW");
      } else {
        System.out.println("TO HIGH");
      }
    }
  }
  private static Looping loops = new Looping();
  public static void main(String args[]) {
    loops.init();
  }
}
