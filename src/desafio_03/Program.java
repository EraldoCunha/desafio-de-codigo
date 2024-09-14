package desafio_03;

public class Program {

    public static void main(String[] args) {

        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("O valor final de SOMA é: " + soma);
    }
}
