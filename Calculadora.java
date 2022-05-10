import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    float n1, n2;

    System.out.println("Escolha um numero: ");
    n1 = read.nextFloat();
    System.out.println("Escolha outro numero: ");
    n2 = read.nextFloat();
    System.out.println("Escolha qual operação você deseja executar: ");

    String op = read.next();
    if (op.equals("+")) {
      System.out.println("O valor da soma é: " + (n1 + n2));
    } else if (op.equals("-")) {
      System.out.println("O valor subtração é: " + (n1 - n2));
    } else if (op.equals("*")) {
      System.out.println("O valor multiplicação é: " + (n1 * n2));
    } else if (op.equals("/")) {
      System.out.println("O valor divisão é: " + (n1 / n2));
    } else {
      System.out.println("Operação inválida!");
    }
  }
}