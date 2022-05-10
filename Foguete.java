import java.util.Scanner;

public class Foguete {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    int X;
    X = 10;

    while (X >= 0) {
      System.out.println("" + X);
      X = X - 1;

    }
    System.out.println("Fogo!");
  }
}
