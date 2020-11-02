package UNIDESC.EstruturaDeDados;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        int[][] produtosVendidosSemana = criaMatriz(3, 7);
        double[] valorProduto = initVetor(3);
        calculaValorSemana(produtosVendidosSemana, valorProduto);
    }

    //CRIA MATRIZ
    public static int[][] criaMatriz(int L, int C) {
        int[][] matriz = new int[L][C];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            System.out.println("--------------Produto " + (i + 1) + "--------------\n");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Insira a quantidade do produto vendido no dia " + (j + 1) + ": ");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("\n\n");
        return matriz;
    }

    // MÉTODO PARA INICIAR VETOR DE VALORES DOS PRODUTOS
    public static double[] initVetor(int T) {
        Scanner entr = new Scanner(System.in);

        double[] vetor = new double[T];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor do produto " + (i + 1) + ":");
            vetor[i] = entr.nextDouble();
        }

        return vetor;
    }

    //Calcula valor de cada produto na semana
    public static void calculaValorSemana(int[][] matriz, double[] valor) {
        double[][] valorVendidoSemana = new double[3][1];
        double[] valores = new double[3];
        int[] vendidoSemana = new int[3], somaDiaSemana = new int[7];
        int soma, maior = 0, indice = 0;
        double valorTotalVendidoNaSemana = 0;

        //QUANTIDADE PRODUTOS VENDIDOS NA SEMANA
        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
            vendidoSemana[i] = soma;
            valores[i] = soma * valor[i];
        }
        //VALOR TOTAL DOS PRODUTOS VENDIDOS NA SEMANA
        System.out.println("\n\n------- VALOR TOTAL DOS PRODUDOS VENDIDOS -------");
        for (int i = 0; i < valorVendidoSemana.length; i++) {
            System.out.print("Produto " + (i + 1) + " teve " + vendidoSemana[i] + " vendidos na semana, e o valor total é: R$");
            for (int j = 0; j < valorVendidoSemana[i].length; j++) {
                valorVendidoSemana[i][j] = valores[i];
                valorTotalVendidoNaSemana = valorTotalVendidoNaSemana + valores[i];
                System.out.println(valorVendidoSemana[i][j]);
            }
        }
        System.out.println("\nValor total vendido na semana é: R$" + valorTotalVendidoNaSemana);

        //PRODUTO QUE MAIS VENDEU NA SEMANA
        if (vendidoSemana[0] > vendidoSemana[1] && vendidoSemana[0] > vendidoSemana[2]) {
            System.out.println("\n\nProduto 1 foi o que mais vendeu na semana");
        } else if (vendidoSemana[1] > vendidoSemana[0] && vendidoSemana[1] > vendidoSemana[2]) {
            System.out.println("\n\nProduto 2 foi o que mais vendeu na semana");
        } else {
            System.out.println("\n\nProduto 3 foi o que mais vendeu na semana");
        }

        //DIA DA SEMANA QUE MAIS VENDEU
        System.out.println("\n\n\n-----------------------------------\n");
        for (int[] ints : matriz) {
            for (int j = 0; j < ints.length; j++) {
                if (j == 0) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                } else if (j == 1) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                } else if (j == 2) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                } else if (j == 3) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                } else if (j == 4) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                } else if (j == 5) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                } else if (j == 6) {
                    somaDiaSemana[j] = somaDiaSemana[j] + ints[j];
                }
            }
        }
        System.out.println("\n\n-------------Produtos vendidos por dia-------------");
        for (int i = 0; i < somaDiaSemana.length; i++) {
            System.out.println((i + 1) + "º dia vendeu: " + somaDiaSemana[i] + " produtos");
            if(somaDiaSemana[i] > maior){
                maior = somaDiaSemana[i];
                indice = (i+1);
            }
        }
        System.out.println("\n---------------------------------------------------");
        System.out.println("O " + indice + "º dia foi oque mais vendeu produtos");
        System.out.println("\n---------------------------------------------------");
    }
}