//hacer un V
public class unaV {
    public static void main(String[]arg){
        int altura=5;

        for (int i=0;i<altura;i++){
            //for para espacios del primer costado
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            //for para la primera diagonal de la V
            for (int j=0;j<altura;j++){
                System.out.print("*");
            }
            //for de los espacios del medio
            for (int j=0;j<(4-i)*2;j++){
                System.out.print(" ");
            }
            //for de la ultima diagonal de la V
            for (int j=0;j<altura;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
