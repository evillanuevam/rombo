import java.util.Scanner;
public class trianguloinvertido {
    public static void main(String[]arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int altura=teclado.nextInt();

        for (int i=0;i<altura;i++){  // INVERTIR LOS FOR DE ABAJO
            for (int j=0; j<i;j++){  //SE QUITO EL +1
                System.out.print(" ");
            }
            for (int j=0;j<altura-i;j++){
                System.out.print("* ");
            }
            System.out.println("");;
        }
    }
}
