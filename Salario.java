import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    float S, AD, AQ;

    System.out.println("Digite o valor do seu salário: ");
    S = read.nextFloat();
    AD = S * 10 / 100;
    AQ = S * 15 / 100;

    if (S > 1250) {
      System.out.println("O seu aumento é de: " + AD);

    } else {
      System.out.println("O seu aumento é de: " + AQ);

    }
  }
}