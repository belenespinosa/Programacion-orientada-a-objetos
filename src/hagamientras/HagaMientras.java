
package hagamientras;
import java.util.Scanner;

public class HagaMientras {

    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
        int acumulador=0;
        int n;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros naturales a sumar: ");
        n=entrada.nextInt();
        do{
            ++contador;
            acumulador+=contador;
        }while(contador<n);
        System.out.println("el numero de numeros sumados es "+contador);
        System.out.println("la suma consecutiva de los "+contador+" primeros numeros es: "+acumulador);
    }
    
}
