package Exercicios;

import java.util.Scanner;

public class Main_Exercicios {
    public static void main(String[] args) {
        ListaExercicios exercicios = new ListaExercicios();
        Scanner scanner = new Scanner(System.in);
        double[] array = {2.5, 5, 3, 1, 4, 4, 8, 6, 7, 4};

        System.out.println("Qual exercicio deseja resolver? ");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                exercicios.soma_array(array);
                break;

            case 2:
                exercicios.maior_menor_array(array);
                break;
            case 3:
                exercicios.quant_pares_impares(array);
                break;
            case 4:
                exercicios.inverte_array(array);
                break;
            case 5:
                exercicios.ordenar_array(array);
                break;
            case 6:
                exercicios.numero_presente(array, 4);
                break;
            case 7:
                exercicios.multiplicar_array(array, 2);
                break;
            case 8:
                exercicios.remove_duplicata(array);
                break;
            case 9:
                exercicios.media_array(array);
                break;
            case 10:
                int[][] matriz = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
                exercicios.transpor_matriz(matriz);
                break;
        }
        scanner.close();
    }
}

