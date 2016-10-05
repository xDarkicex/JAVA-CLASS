import java.io.Console;
import java.io.PrintStream;


public class Eta{
  public Console console=System.console();
  Eta(){ System.out.println("Eta constructor has been constructed"); }

public void init() {
  float speed = 0;
  float distance = 0;
  while (true) {
  
    while(true){
      Writer.say("Enter Distance to Location in Miles: ");
      String input = console.readLine();
      try { distance=Integer.parseInt(input); break; }
      catch(NumberFormatException e) { Writer.say("Invalid input"); }
    }
    Writer.say("Enter Travel Speed in MP/h: ");
    String input = console.readLine();
    try { speed=Integer.parseInt(input); break; }
    catch(NumberFormatException e) { Writer.say("Invalid input"); }
  }
  eta.estmate(distance, speed);

}
public void estmate(float x, float y){
  float input = (x / y);
  int hours = (int)Math.floor(input);
  int minutes = (int)((input % 1) * 60);
  int seconds = (int)((input * 60 * 60) % 60);
  Writer.say(hours+":"+ minutes+":"+seconds);
}

  public static void clear_screen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  private static Eta eta = new Eta();
  public static void main(String args[]) {
    eta.init();
  }
}