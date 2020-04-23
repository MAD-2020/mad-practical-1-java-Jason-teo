import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: "); //This prompts for number
    int number = input.nextInt();//indicates the number of inputs next
    int result = 0;
    for (int x = 0; x < number;x++){
      System.out.println("Enter any number: ");//user inputs the numbers
      int newNumber = input.nextInt();
      if (result<newNumber){//immediately compares the previous number with the new one
        result = newNumber;
      }
    }

    System.out.println("result:" +result);//print the largest number
     */
     
    Scanner in = new Scanner(System.in);
    
  }
}
