import java.util.Scanner;

/*
 *
 */
public class Main {
  public static String getGreeting(String name) {
    return String.format("Hello %s.", name);
  }

  public static void main(String[] args) {
    System.out.print("Geben Sie ihren Namen ein: ");
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    String greeting = getGreeting(name);
    System.out.println(greeting);
  }
}
