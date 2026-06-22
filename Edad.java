import java.util.*;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        do {
            System.out.print("Edad: ");
            edad = sc.nextInt();
        } while(edad < 0 || edad > 120);

        System.out.println("Edad válida");
    }
}