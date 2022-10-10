//ejercicio 39 - triangulo basico a un lado-
import java.util.Scanner;
public class ejercicio39 {
    public static void main(String[]arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int altura=teclado.nextInt();

        for (int i=0;i<altura;i++){   //i=0    0<3     i++
            for (int j=0;j<=i;j++){   //j=0    0<=0     i++
                System.out.print("*");  //*
            }
            System.out.println("");;
        }
    }
}
