import java.util.*;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = (int)(Math.random()*10)+1;
        int intento;

        do {
            System.out.print("Adivina: ");
            intento = sc.nextInt();
        } while(intento != secreto);

        System.out.println("Ganaste");
    }
}