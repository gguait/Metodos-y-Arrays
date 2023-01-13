
import java.util.Arrays;

public class PruebaMetodos2 {
    
    public static void mostrarArrayPantalla(int[][] matriz) {
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                            System.out.print(matriz[i][j] + ", ");
//            }
//            System.out.println();
//        }
//        System.out.println();


            for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" | ");
                System.out.print(matriz[x][y]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
//    Escribe un método, de nombre rellenarMatrizSecuencia2D, que reciba
//    una matriz de enteros por parámetro y la rellene para que sus
//    posiciones almacenen un valor que se irá incrementando en una
//    unidad por columnas. La matriz se rellenará de manera que dos
//    elementos consecutivos según la primera dimensión almacenen dos
//    valores también consecutivos. Una matriz de 5 elementos en la
//    primera dimensión y 5 en la segunda quedaría como sigue:
    
    public static int[][] rellenarMatrizSecuencia2D(){
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (j*5) + i;
            }
        }
        
        return matriz;
    }
    
    public static void main(String[] args) {
//        mostrarArrayPantalla(rellenarMatrizSecuencia2D()); 
        
    }
}
