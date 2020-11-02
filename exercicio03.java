package UNIDESC.EstruturaDeDados;

import java.util.Random;

public class exercicio03 {
    public static void main(String[] args) {
        int[][] matriz = criaMatriz(3, 4);
        System.out.println("=======================Matriz Normal=======================");
        imprimeMatriz(matriz);
        System.out.println();
        int[][] transposta = matrizTrans(matriz);
        System.out.println("=======================Matriz Transposta=======================");
        imprimeMatriz(transposta);

    }

    //CRIA MATRIZ
    public static int[][] criaMatriz(int N, int M) {
        int[][] matriz = new int[N][M];

        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100);

            }
        }
        return matriz;
    }

    //IMPRIME MATRIZ
    public static void imprimeMatriz(int[][] matriz) {

        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }

    }

    //Matriz transposta//
    public static int[][] matrizTrans(int[][] matriz) {
        int[][] matrizT = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }
}
