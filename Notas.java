import java.util.*;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        String resp;

        do {
            System.out.print("Nota: ");
            nota = sc.nextDouble();
            suma += nota;

            sc.nextLine();
            System.out.print("¿Continuar? (s/n): ");
            resp = sc.nextLine();

        } while(resp.equalsIgnoreCase("s"));

        System.out.println("Total: " + suma);
    }
}