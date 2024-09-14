package desafio_01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (estaPresente(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean estaPresente(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;
        int proximo;

        while (atual < numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == numero;
    }
}
