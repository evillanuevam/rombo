import java.util.Scanner;
public class ProductoPrimo {
    public static void main(String [] arg){
        Scanner teclado = new Scanner(System.in);
        int c,numero;
        int p=0;

        System.out.print("introduce un número: ");
        numero = teclado.nextInt();
        c = 0;

        for(int y =2;y <= numero; y++){
           for(int z =1;z <= numero; z++){
                if ((numero%z)==0) {
                    c++;
                }
               if (c <= 2){
                   System.out.print( y + ",");
               }
           }

        }





        //if(c <=2){
        //    System.out.println("El numero es primo");
        //}
        //else{
        //    System.out.println("El numero no es primo");
        //}

    }
}
