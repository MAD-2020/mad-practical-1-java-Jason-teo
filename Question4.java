import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: "); //This prompts for number
    int number = input.nextInt();//stores number value
    for (int y = number; y > 0;y--){//this determines the height of the triangle
      for (int x=0; x < y;x++){//this determines the number of stars horizontally
        System.out.print("*");
      }
      System.out.println();//This starts on next line for the next row
    }
  }
}
