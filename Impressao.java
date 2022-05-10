import java.util.Scanner;

public class Impressao {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    int n;

    System.out.println("Escolha um número: ");
    n = read.nextInt();

    int i = 1;

    while (i <= n) {
      System.out.println(i);
      i++;
    }

  }
}