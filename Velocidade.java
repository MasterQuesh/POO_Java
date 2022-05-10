import java.util.Scanner;

public class Velocidade {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    float vel, M;

    System.out.println("Digite a velocidade do veículo: ");
    vel = read.nextFloat();
    if (vel > 80) {
      M = (vel - 80) * 5;
      System.out.println("O valor da multa é de: " + M);
    } else {
      System.out.println("Ok");
    }

  }
}