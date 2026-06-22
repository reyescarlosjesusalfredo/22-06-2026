import java.util.*;

public class Sumanumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;

        do {
            System.out.print("Número: ");
            num = sc.nextInt();
            suma += num;
        } while(num != 0);

        System.out.println("Suma: " + suma);
    }
}