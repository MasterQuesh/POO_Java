import java.util.Scanner;

public class Emprestimo {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    float V, S, P;
    int A, M;

    System.out.println("Digite o valor da casa: ");
    V = read.nextFloat();
    System.out.println("Digite o seu salário: ");
    S = read.nextFloat();
    System.out.println("Quantos anos para pagar? ");
    A = read.nextInt();

    M = A * 12;
    P = V / M;

    if (P > S * 0.3) {
      System.out.println("Infelizmente você não pode obter o empréstimo.");
    } else {
      System.out.println("Valor da prestação: R$: " + P);
    }
  }
}