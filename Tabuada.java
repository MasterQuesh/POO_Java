import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {

    System.out.println("Informe um número:");

    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    int cont = 0;

    while (cont != 10) {
      cont++;
      int resul = num * cont;
      System.out.printf("%d * %d = %d\n", num, cont, resul);

    }
  }
}