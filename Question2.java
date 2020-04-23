import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your Height: "); //This prompts for user Height
    double height = input.nextDouble();
    System.out.println("Enter your Weight: "); //This prompts for user Weight
    double weight = input.nextDouble();

    System.out.println("height:" + height + "cm\n" + "weight: "+ weight+"kg");//prints height and weight

  }
}
