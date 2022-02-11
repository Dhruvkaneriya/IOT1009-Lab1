// Name: Dhruv Kaneriya
// Enrollement Number: A00226210
// In this program I will use three different sides dice like d6,d10 and d20 then I will make new files DiceGame then
// then I will make DiceGame using those three dices.

import java.util.Random;
// Main class
public class Die
{
      private String name; // name variable is create for store dice name.
      private int Total_dice_sides; // Total_dice_sides variable is create for store total sides of dices.
      private int Current_side_up; // Current_side_up variable is create for the current side of die.

      // This is my first 0 argument constructor
      public Die()
      {
          // In this constructor I will create default name and total sides of d6 dice.
          name = "d6";
          Total_dice_sides = 6;
          roll();
      }

      // This is my second 1 argument constructor
      public Die(int Total_dice_sides)
      {
          // In this constructor I will create total sides of d10 dice.
          this.Total_dice_sides = Total_dice_sides;
          name = "d" + Total_dice_sides;
          roll();
      }

      // This is my third 2 argument constructor
      public Die(int Total_dice_sides, int Current_side_up)
      {
          // In this constructor I will create current side and total sides of d20 dice.
          this.Total_dice_sides = Total_dice_sides;
          name = "d" + Total_dice_sides;
          this.Current_side_up = Current_side_up;
      }

      // roll method
      public void roll()
      {
          // in this method I will make random funcation for current side of dice.
          Current_side_up = (int)((Math.random() * Total_dice_sides) + 1);
      }

      // this method return name of dice.
      public String name()
      {
          return name;
      }

      // this method return current side of dice.
      public int Current_side_up()
      {
          return Current_side_up;
      }

      // this method poimts current sides of dice.
      public void Current_side(int Current_side_up)
      {
         this.Current_side_up = Current_side_up;
      }

}
