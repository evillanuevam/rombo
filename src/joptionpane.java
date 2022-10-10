import javax.swing.JOptionPane;
public class joptionpane {
    public static void main(String[] Args) {
            String entradaUsuario = JOptionPane.showInputDialog("Introduzca un número:");
            System.out.println("El doble del número introducido es: " + 2 * Integer.valueOf(entradaUsuario));
        }

}
