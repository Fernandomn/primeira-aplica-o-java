//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun - Maverick");

        int anoDeLancamento  = 2022;

        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        String sinopse;

        sinopse = """
                Filme: Top Gun Maverick
                Sinopse: filme de ação continuação de filme dos anos 1980
                Ator principal: Tom Cruise
                Ano de lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}