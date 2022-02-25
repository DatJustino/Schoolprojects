
import java.util.Scanner;

  public class Main {
    Scanner in = new Scanner(System.in);
    void detVirker() {
      System.out.println("it Works!");
    }//
    void greet() {
      System.out.println("enter your name for testing: ");
      String answer = in.nextLine();
      System.out.println("Your name is: "+ answer);
      System.out.println("oops forgot something (but i didnt, oops!)");
      System.out.println("morasdmmmoore training pushpushpush");
    }
    void askAboutAge() {
      System.out.println("Add your age: ");
      int ageAnswer = in.nextInt();
      System.out.println("Your age is: " + ageAnswer);
    }
    public static void main(String[] args) {
      new Main().detVirker();
      new Main().greet();
      new Main().askAboutAge();
    }
  }

