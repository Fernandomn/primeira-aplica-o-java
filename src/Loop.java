import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double somaAvaliacao = 0;
        int qntFilmes = 3;
        double nota = 0;

        for (int i = 0; i < qntFilmes; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble();
            somaAvaliacao += nota;
        }

        System.out.println("Media de avaliações: %.2f".formatted(somaAvaliacao / qntFilmes));
    }
}
