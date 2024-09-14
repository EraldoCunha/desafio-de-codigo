package desafio_02;

import java.text.Normalizer;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String entrada = sc.nextLine();

        String entradaNormalizada = Normalizer.normalize(entrada, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        int quantidadeDeAs = 0;

        for (int i = 0; i < entradaNormalizada.length(); i++) {
            char caractere = entradaNormalizada.charAt(i);

            if (caractere == 'a' || caractere == 'A') {
                quantidadeDeAs++;
            }
        }

        if (quantidadeDeAs > 0) {
            System.out.println("A letra 'a' aparece " + quantidadeDeAs + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        sc.close();
    }
}
