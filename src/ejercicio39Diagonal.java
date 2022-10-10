//dibujar la diagonal, variante del ejercicio 39
import java.util.Scanner;
public class ejercicio39Diagonal {
    public static void main(String[]arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int altura=teclado.nextInt();

        for (int i=0;i<altura;i++){  //i=0    0<3   si      //i=1   1<3   si         //i=2  2<3  si
            for (int j=0;j<i;j++){   //j=0  0<0     no      //j=0   0<1   si " "    //j=0  0<2   si " " --> 1<2 " "
                System.out.print(" ");
            }
            for (int j=0;j<altura;j++){   //j=0  0<=0   si *   //j=0  0<=1   si *  -> *   //j=0 0<=2 si * --> 1<=2 * --> 2<=2 *
            System.out.print("*");
            }
            System.out.println("");;
        }
    }
}
