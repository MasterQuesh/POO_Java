import java.util.Scanner;

public class Corrida {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    double DP, CD, CM;

    System.out.println("Digite a distância que você deseja percorrer: ");
    DP = read.nextDouble();
    CD = DP * 0.50;
    CM = DP * 0.45;

    if (DP > 200) {
      System.out.println("O valor da corrida é de: " + CM);
    } else {
      System.out.println("O valor da corrida é de: " + CD);
    }
  }
}