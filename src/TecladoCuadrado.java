//ejemplo de hacer cuadrado ingresando con el teclado, con scaner
import java.util.Scanner;
public class TecladoCuadrado {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese valor: ");

        int valor = teclado.nextInt();
        //teclado.close();

    for (int f = 1; f <= valor; f++) {
           for (int c = 1; c <= valor; c++){
                System.out.print(" *");
           }
           System.out.println();//Salto de línea para pasar a la siguiente FILA
    }

    }
}
