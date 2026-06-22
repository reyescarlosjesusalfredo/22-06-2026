import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Opción");
            System.out.println("2. Salir");
            opcion = sc.nextInt();

        } while(opcion != 2);
    }
}