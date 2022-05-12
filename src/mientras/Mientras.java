
package mientras;
import java.util.Scanner;
public class Mientras {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=1;
        float totals=0;
        float sueldo;
        float prom;
        Scanner entrada=new Scanner(System.in);
        while (cont<=10){
            System.out.print("Ingrese el sueldo del trabajador "+cont+" :");
            sueldo=entrada.nextFloat();
            totals+=sueldo;
            ++cont;
        }
        System.out.println("el total de los sueldos es: "+totals);
        prom=totals/10;
        System.out.println("el promedio de sueldosn es: "+prom);
    }
    
}
