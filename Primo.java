import java.util.*;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        int divisores = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                divisores++;
            }
        }

        if(divisores == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}