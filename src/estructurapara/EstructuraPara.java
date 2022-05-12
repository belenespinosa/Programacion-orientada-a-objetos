
package estructurapara;
import java.util.Scanner;

public class EstructuraPara {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int serie=3;
        Scanner entrada=new Scanner(System.in);
        System.out.print("¿cuantos numeros de la serie desea?:");
        n=entrada.nextInt();
        for ( int i=0;i<n;i++){
            System.out.print(serie+" , ");
            serie+=3;
        }
       System.out.println();
    }
    
}
