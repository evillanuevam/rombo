import java.util.Scanner;
public class Triangulometodo2 {
    public static void main(String[]arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int altura=teclado.nextInt();

        for (int i=0;i<altura;i++){
            for (int j=0;j<altura-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0; j<i+1;j++){
                System.out.print(" *");
            }
            System.out.println("");;
        }
    }
}
