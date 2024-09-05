import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite a palavra que você gostaria que fosse invertida");
        String palavraParaInverter = scanner.nextLine();

        // Aqui iremos adicionar cada letra da String em formato de char
        List<Character> letrasDaPalavra = new ArrayList<>();

        // Aqui, um loop for each que irá transformar as letras em char
        for (char letra : palavraParaInverter.toCharArray()) {
            letrasDaPalavra.add(letra);
        }

        // Aqui iremos efetivamente inverter a ordem das letras com a função inverterPalavra e trazer a palavra invertida
        System.out.println("Sua palavra invertida é: " + inverterPalavra(letrasDaPalavra, palavraParaInverter));
    }

    private static String inverterPalavra(List<Character> letrasDaPalavra, String palavraParaInverter) {
        var construtorDeString = new StringBuilder();

        // Aqui eu descobri que a função .size() não retorna o índice da lista, e sim a quantidade de itens, o que parando para pensar agora é óbvio. Então coloquei - 1
        for (int i = letrasDaPalavra.size() - 1; i >= 0; i--) {
            construtorDeString.append(palavraParaInverter.charAt(i));
        }

        return construtorDeString.toString();
    }
}