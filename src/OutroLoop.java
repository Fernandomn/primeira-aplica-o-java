import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double somaAvaliacao = 0;
        int qntFilmes = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme (-1 para encerrar): ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                somaAvaliacao += nota;
                qntFilmes++;
            }
        }

        if (qntFilmes > 0) {
            System.out.println("Media de avaliações: %.2f".formatted(somaAvaliacao / qntFilmes));
        }
    }
}
