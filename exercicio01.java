package UNIDESC.EstruturaDeDados;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        int[] vetor1 = initVetor();

        printVetor(vetor1);
        invVetor(vetor1);


    }

    // MÉTODO PARA INICIAR VETOR
    public static int[] initVetor() {
        Scanner entr = new Scanner(System.in);
        int n;
        do {
            System.out.println("Tamanho do vetor tem que ser maior do que zero");
            n = entr.nextInt();
        } while (n <= 0);

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor inteiro");
            vetor[i] = entr.nextInt();
        }

        return vetor;
    }

    // MÉTODO PARA INVERTER O VETOR
    public static void invVetor(int[] vet) {
        int aux;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
            }
        }
        System.out.println("vetor Invertido: " + Arrays.toString(vet));
    }

    // IMPRIMIR VETOR
    public static void printVetor(int[] vetor) {
        System.out.println("Conteudo do Vetor: " + Arrays.toString(vetor));
    }
}
