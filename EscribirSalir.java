import java.util.*;

public class EscribirSalir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            String texto = sc.nextLine();

            if(texto.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingresó: " + texto);
        }
    }
}