
package repetitivasanidados;

public class RepetitivasAnidados {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("tabla de multiplicar del 1 al 10:");
        for(int i=1; i<10;i++){
            System.out.println("TABLA DE "+i);
            for (int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
        
    }
    
}
