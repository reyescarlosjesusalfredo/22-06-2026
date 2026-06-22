import java.util.*;

public class Contar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int intentos = 0;

        do {
            System.out.print("Ingrese valor mayor a 10: ");
            num = sc.nextInt();
            intentos++;
        } while(num <= 10);

        System.out.println("Intentos: " + intentos);
    }
}