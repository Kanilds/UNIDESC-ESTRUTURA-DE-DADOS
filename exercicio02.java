package UNIDESC.EstruturaDeDados;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        int[] vetor1 = initVetor();
        int[] vetor2 = initVetor();

        printVetor(vetor1);
        System.out.println("-----------------------");
        printVetor(vetor2);
        System.out.println("-----------------------");
        appendVetor(vetor1, vetor2);
        System.out.println("-----------------------");
        perfectVetor(vetor1);
        System.out.println("-----------------------");
        perfectVetor(vetor2);

    }


    //CONCATENAR VETORES
    public static void appendVetor(int[] v1, int[] v2) {

        int[] v3 = new int[v1.length + v2.length];
        System.arraycopy(v1, 0, v3, 0, v1.length);
        System.arraycopy(v2, 0, v3, v1.length, v2.length);

        System.out.println("Vetores Concatenados: " + Arrays.toString(v3));
    }

    // MÉTODO PARA INICIAR VETOR
    public static int[] initVetor() {
        Scanner entra = new Scanner(System.in);
        int n;
        do {
            System.out.println("Tamanho do vetor tem que ser maior do que zero");
            n = entra.nextInt();
        } while (n <= 0);

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor inteiro");
            vetor[i] = entra.nextInt();
        }

        return vetor;
    }

    //VETOR DE NUMEROS PERFEITOS
    public static void perfectVetor(int[] vetor) {

        int elemento, soma, cont;
        int[] vetTemp = new int[vetor.length];
        int[] numerosPerfeitos;

        cont = 0;

        for (int k : vetor) {
            soma = 0;
            elemento = k;
            for (int j = 1; j < elemento; ++j)

                if ((elemento % j) == 0)
                    soma += j;

            if (soma == elemento)
                vetTemp[cont++] = elemento;

        }

        numerosPerfeitos = new int[cont];
        if (cont >= 0) System.arraycopy(vetTemp, 0, numerosPerfeitos, 0, cont);

        if (numerosPerfeitos.length == 0) {
            System.out.println("Não existem numeros perfeitos");
        } else
            System.out.println("Os numeros perfeitos do Vetor são: " + Arrays.toString(numerosPerfeitos));
    }

    // IMPRIMIR VETOR
    public static void printVetor(int[] vetor) {
        System.out.println("Conteudo do Vetor: " + Arrays.toString(vetor));
    }

}
