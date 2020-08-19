import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    String doAgain;
    do {
      System.out.println("Input a lower bound number!");
      Scanner scanner = new Scanner(System.in);
      String lowerBoundString;
      int lowerBound = 0;
      do {
        try {
          lowerBoundString = scanner.nextLine();
          lowerBound = Integer.parseInt(lowerBoundString);
          System.out.println(lowerBound);
        } catch (NumberFormatException error) {
          System.out.println("WHY DONT YOU LISTEN TO DIRECTIONS! A NUMBER PLS!");
          lowerBoundString = "";
        }
      }while(lowerBoundString.equals(""));
      System.out.println("Input an upper bound number!");
      int upperBound = scanner.nextInt();
      System.out.println(upperBound);

      int sum = 0;
      for (int i = lowerBound; i <= upperBound; i++) {
        sum = sum + i;
      }
      System.out.println("The sum of all the numbers between " + lowerBound + " and " +
          upperBound + " is " + sum);

      double average = (double) sum / (upperBound - lowerBound + 1);
      System.out.println("The average is " + average);

      System.out.println("Do you want to calculate another set of numbers? (y/n)?");
      doAgain = scanner.next().toLowerCase();
    } while(doAgain.equals("y"));
  }

}
