import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: "); //This prompts for number
    int number = input.nextInt();//stores number value
    int result = number * number;//Multiplies the number by itself

    System.out.println("Result:" + result);//prints results
    
  }
}
