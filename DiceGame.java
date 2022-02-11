// I will inherite Die file in DiceGame
public class DiceGame extends Die
{
  public static void main(String[] args)
  {
     // I will make three objects of die class three arguments.
      Die d6 = new Die();
      Die d10 = new Die(10);
      Die d20 = new Die(20,2);

      System.out.println("Creating a default d6...");
      System.out.println("Creating a d20...");
      System.out.println("Creating percentile die (a special d10)...");

      System.out.println("The Current side up for "+ d6.name() + " is " + d6.Current_side_up());

      System.out.println("The Current side up for " + d20.name()+ " is "+ d20.Current_side_up());

      System.out.println("The Current side up for percentile is " + d10.Current_side_up());

      // I will check my roll method here
      System.out.println("\nTtesting the roll method\n");

      System.out.println("Rolling the d6...");
      d6.roll();
      System.out.println("The new value is " + d6.Current_side_up());

      System.out.println("Rolling the d20...");
      d20.roll();
      System.out.println("The current side up for d20 is " + d20.Current_side_up());

      System.out.println("Rolling the percentile...");
      d10.roll();
      System.out.println("The new value is " + d10.Current_side_up());

      System.out.println("\nSetting the d20 to slow 20...");

      d20.Current_side(20);
      System.out.println("the side up is now " + d20.Current_side_up() + ".Finally.");
  }
}
