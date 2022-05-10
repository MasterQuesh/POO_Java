import java.util.Scanner;

public class Poupanca {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    float D, T, S;
    int M;

    System.out.println("Depósito inicial: ");
    D = read.nextFloat();
    System.out.println("Taxa de juros: ");
    T = read.nextFloat();
    M = 1;
    S = D;

    while (M <= 24) {
      S = S + (S * (T / 100));
      System.out.printf("Saldo do mês: " + M, "é de R$: " + S);
      M = M + 1;
      System.out.printf("O ganho obtido com juros foi de R$: " + S, -D);
    }

  }
}
