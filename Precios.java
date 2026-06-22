import java.util.*;

public class Precios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio;
        double total = 0;

        do {
            System.out.print("Precio (0 para salir): ");
            precio = sc.nextDouble();
            total += precio;

        } while(precio != 0);

        System.out.println("Total compra: " + total);
    }
}