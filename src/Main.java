import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE EL NUMERO DE FILAS (RECUERDA: Para algebra de matrices, éstas deben tener el mismo número de filas y de columnas)");
        int filas = scanner.nextInt();
        System.out.println("DIGITE EL NUMERO DE COLUMNAS");
        int columnas = scanner.nextInt();
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];
        int[][] resta = new int[filas][columnas];
        int[][] multiplicacion = new int[matriz1.length][matriz2[0].length];

        System.out.println("DIGITE LOS DATOS DE LA PRIMER MATRIZ:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nLA PRIMERA MATRIZ ES:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.printf("%3d", matriz1[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("DIGITE LOS DATOS DE LA SEGUNDA MATRIZ:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nLA SEGUNDA MATRIZ ES:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("%3d", matriz2[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("\nLA SUMA ES: ");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.printf("%3d", suma[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resta[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        System.out.println("\nLA RESTA ES: ");
        for (int i = 0; i < resta.length; i++) {
            for (int j = 0; j < resta[i].length; j++) {
                System.out.printf("%3d", resta[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < multiplicacion.length; i++) {
            for (int j = 0; j < multiplicacion[0].length; j++) {
                for (int k = 0; k < matriz2.length; k++) {
                    multiplicacion[i][j] = multiplicacion[i][j] + matriz1[i][k] * matriz2[k][j];
                }
            }
            System.out.println();
        }
        System.out.println("LA MULTIPLICACION ES: ");
        for (int i = 0; i < multiplicacion.length; i++) {
            for (int j = 0; j < multiplicacion[i].length; j++) {
                System.out.printf("%3d", multiplicacion[i][j]);
            }
            System.out.println();
        }
    }
}