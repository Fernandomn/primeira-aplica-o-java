import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String introducao = """
                            Qual o tipo de temperatura inicial?
                            1. Celcius
                            2. Fahrenheit
                            """;
        System.out.println(introducao);
        String tipoTemperatura = leitura.next();

        System.out.println("Qual a temperatura a ser convertida?");
        double temperatura = leitura.nextDouble();

        switch (tipoTemperatura){
            case "1":
                // Celcius
                System.out.println("Temperatura convertida: %.2f".formatted((temperatura*1.8)+32));
                break;
            case "2":
                // Fahrenheit
                System.out.println("Temperatura convertida: %.2f".formatted((temperatura-32)/1.8));
                break;
            default:
        }
    }
}
