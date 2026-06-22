import java.util.*;

public class Convertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resp;

        do {
            System.out.print("Celsius: ");
            double c = sc.nextDouble();

            double f = (c * 9/5) + 32;

            System.out.println("Fahrenheit: " + f);

            sc.nextLine();
            System.out.print("¿Continuar? (s/n): ");
            resp = sc.nextLine();

        } while(resp.equalsIgnoreCase("s"));
    }
}