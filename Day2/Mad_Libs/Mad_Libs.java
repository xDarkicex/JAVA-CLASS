import java.io.Console;

public class Mad_Libs{
  Mad_Libs(){ System.out.println("Mad_Libs constructor"); }
  private Console console = System.console();
  String name;
  String animal;
  String famous_person;
  String car;
  String food;
  public void init(){
    Writer.say("Please provide 5 words");
    Writer.say("Favorite Name?");
    name = console.readLine();
    Writer.say("Favorite animal?");
    animal = console.readLine();
    Writer.say("Favorite Famous Person?");
    famous_person = console.readLine();
    Writer.say("Least Favorite Car?");
    car = console.readLine();
    Writer.say("Favorite food?");
    food = console.readLine();
    confirm();
  }
  public void confirm(){
    Writer.say("Name: ["+name+"]"+"\n"+"Animal: ["+animal+"]"+"\n"+"famous_person: ["+famous_person+"]"+"\n"+"Worst Car: ["+car+"]"+"\n"+"food: ["+food+"]");
    Writer.say("confirm?");
    int input = Interaction.choose(new String[]{"Yes","No"});
    // At this point, we should have a valid option.
    switch(input) {
      // start mad lib
      case 1:
        Mad_Libs.clear_screen();
        start();

        break;
      // reenter values
      case 2:
        init();
        break;
    }
  }
  public void start(){
      Writer.say(name+" Went the the store, "+name+"'s favorite food is "+food+".\n"+" while at the store "+name+" saw "+famous_person+" driving a "+car+" way to fast, before "+famous_person+" hit a "+animal);
      init();
  }
  public static void clear_screen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }
  private static Mad_Libs story = new Mad_Libs();
  public static void main(String args[]){
    story.init();
   }
}
