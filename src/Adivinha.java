import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int numeroCerto = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int numeroTentado;
        boolean certaResposta = false;
        int tentativas = 0;

        System.out.println("tente adivinhar o numero correto, de 0 a 100!");

        while (!certaResposta) {
            System.out.printf("Digite sua %d-esima tentativa :%n", tentativas++);
            numeroTentado = scanner.nextInt();
            certaResposta = numeroCerto == numeroTentado;

            if (!certaResposta) {
                System.out.println("Não foi dessa vez, tente novamente");
                if (numeroCerto > numeroTentado) {
                    System.out.println("O numero correto é maior.");
                } else {
                    System.out.println("O numero correto é menor.");
                }
            }
        }
        System.out.println("Parabéns, você acertou! O numero correto é " + numeroCerto);
    }
}
