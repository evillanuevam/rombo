public class piramide {
    public static void main(String[]arg){
        int altura = 1;
        int fila = 5;
        int blancos = 1;
        int asterisco = 1;
        for(altura = 1; altura<=fila; altura++){
            //espacios en blanco
            for(blancos = 1; blancos<=fila-altura; blancos++){
                System.out.print(" ");
            }
            //asterisco
           for(asterisco = 1;asterisco<=(altura*2)-1;asterisco++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
}


