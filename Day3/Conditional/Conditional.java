import java.io.Console;
import java.io.PrintStream;

public class Conditional{
  Conditional(){ System.out.println("Main constructor"); }
  private Console console = System.console();
  String guess;
  boolean debug;
  int answer;
  float number;
  int if_won;
  boolean Continue;
  int difficulty = 1;
  int guess_num;
  public void set_difficulty(int difficulty){ this.difficulty = difficulty; }
  public void set_guess_num(int guess_num){ this.guess_num = ((int)Math.pow(difficulty, 2)); }

  public void init(){
    Continue = true;
    Writer.say("Guess a number");
    while (Continue) {
      set_difficulty(difficulty);
      set_guess_num(guess_num);
      Writer.say("1 Through "+guess_num);
    guess = console.readLine();


    number=Float.valueOf(guess);
    int x=(int)number;
    answer = (int) Math.floor(Math.random() * guess_num);

    if (x == answer){
      Writer.say("**** You win  ****");
      if_won = 1;
      difficulty = difficulty+1;
    } else if (x < answer){
      Writer.say("Your guess was to low! "+"Answer: "+answer);
      if_won = 2;
    } else {
      Writer.say("Your guess was too high! "+"Answer: "+answer);
      if_won = 3;
    }

    try { Thread.sleep(1000); }
    catch(InterruptedException e) { }
      if (if_won == 1){
        Writer.say("Wow You won!, would you like to Continue, the dificulty will increase!");
      } else if (if_won == 2){
        int input = Interaction.choose(new String[]{"Continue","Quit"});
        switch(input) {
          case 1:
            conditions.init();
          case 2:
            Continue = false;
            break;
        }
      } else{
        int input = Interaction.choose(new String[]{"Continue","Quit"});
        switch(input) {
          case 1:
            conditions.init();
          case 2:
            Continue = false;
            break;
        }

      }

  }


    clear_screen();

  }
  public static void clear_screen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }
  private static Conditional conditions = new Conditional();
  public static void main(String args[]){
    conditions.init();
   }
}
