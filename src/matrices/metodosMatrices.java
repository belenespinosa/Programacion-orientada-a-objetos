
package matrices;
import java.util.Scanner;


public class metodosMatrices {
    //final int FILAS = 5, COLUMNAS = 4;
    int filas;
    int columnas;
    Scanner entrada = new Scanner(System.in);
    int f, c, mayor, menor;
    int filaMayor, filaMenor, colMayor, colMenor;
    int[][] matriz;//definir tamaño matriz
    
    public void ingresarMatrriz(){
        System.out.print("ingrese el numero de FILAS de la matriz: ");
        filas=entrada.nextInt();
        System.out.print("ingrese el numero de COLUMNAS de la matriz: ");
        columnas=entrada.nextInt();
        matriz =new int[filas][columnas];
        
        }
     
    public void cuadradaMatriz(){
        if(filas==columnas){
        System.out.println("Ingrese los elemntos de la matriz");
        for(f=0;f<filas;f++){
            for(c=0;c<columnas;c++){
                System.out.print("matriz ["+f+"]["+c+"]: ");
                matriz[f][c]=entrada.nextInt();
                
            }
          }
        mostrarMatriz();
        System.out.println(sumaMatriz());
        System.out.println(diagonalMatriz());
        //System.out.println(diagonalInversa());
        }
            else{
                    System.out.println("la matriz no es cuadrada");
                    }
    }
    public void mostrarMatriz(){
      System.out.println("La matriz ingresada es:");
        for (f = 0; f < filas; f++) { 
            for (c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
    public int sumaMatriz(){
        int suma=0;
        System.out.println("la suma de los elementos de la matriz ingresada es:");
        for(f=0; f<filas; f++){
            for(c=0; c<columnas; c++){
                suma=suma+matriz[f][c];
            }
        }
        return suma;
    }
    public int diagonalMatriz(){
        int diagonal=0;
        System.out.println("la suma de los elementos de la diagonal principal");
        for(f=0; f<filas ; f++){
            for(c=0; c<columnas; c++){
                if(f==c){
                    diagonal=diagonal+matriz[f][c];
                }
            }
        }   
        return diagonal;
    }
    /*public int diagonalInversa(){
        int dinversa=0;
        
        System.out.println("la suma de los elementos de la diagonal invversa");
        for(f=filas; f>0 ; f--){
            for(c=columnas; c>0; c--){
                if(c==f){
                    dinversa=dinversa+matriz[f][c];
                }
            }
        }   
        return dinversa;
    }*/
    
}
