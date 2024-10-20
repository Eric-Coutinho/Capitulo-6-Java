package Exercicios;

import java.util.Arrays;

public class ListaExercicios {
    public void soma_array(double[] array) {
        float soma = 0;
        for(int i = 0; i < array.length; i++) {
            soma += (float) array[i];
        }
        System.out.println("Soma dos elementos: " + soma);
    }

    public void maior_menor_array(double[] array) {
        float maior = -999999999;
        float menor = 999999999;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = (float) array[i];
            }
            if (array[i] < menor) {
                menor = (float) array[i];
            }
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }

    public void quant_pares_impares(double[] array) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
    }

    public void inverte_array(double[] array) {
        System.out.println("Array inicial: " + Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            float temp = (float) array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        System.out.println("Array invertido: " + Arrays.toString(array));
    }

    // bubble sort
    public void ordenar_array(double[] array) {
        System.out.println("Array inicial: " + Arrays.toString(array));
        boolean changed;

        for (int i = 0; i < array.length - 1; i++) {
            changed = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    float temp = (float) array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public void numero_presente(double[] array, float number) {
        boolean wasFound = false;
        int timesFound = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                wasFound = true;
                timesFound++;
            }
        }
        if (wasFound) {
            if (timesFound > 1) {
                System.out.printf("Numero encontrado no array %d vezes.", timesFound);
            }
            else {
                System.out.println("Numero encontrado no array.");
            }
        }
        else {
            System.out.println("Numero nao encontrado no array.");
        }
    }

    public void multiplicar_array(double[] array, float multiplicador) {
        System.out.println("Array inicial: " + Arrays.toString(array));
        float[] array_multiplicado = new float[array.length];

        for (int i = 0; i < array.length; i++) {
            array_multiplicado[i] = (float) (array[i] * multiplicador);
        }

        System.out.println("Array multiplicado: " + Arrays.toString(array_multiplicado));
    }

    public void remove_duplicata(double[] array) {
        System.out.println("Array inicial: " + Arrays.toString(array));
        float[] array_sem_duplicata = new float[array.length];
        int new_size = 0;

        for (int i = 0; i < array.length; i++) {
            boolean exists = false;

            for (int j = 0; j < new_size; j++) {
                if (array[i] == array_sem_duplicata[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                array_sem_duplicata[new_size] = (float) array[i];
                new_size++;
            }
        }

        float[] array_final = Arrays.copyOf(array_sem_duplicata, new_size);
        System.out.println("Array sem duplicatas: " + Arrays.toString(array_final));
    }

    public void media_array(double[] array) {
        double media = 0;
        double soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        media = soma / array.length;

        System.out.println("Media dos valores do array: " + media);
    }

    public void transpor_matriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] matrizTransposta = new int[colunas][linhas];

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j]);
                if (j < matrizTransposta[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }


}
