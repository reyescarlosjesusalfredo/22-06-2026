import java.util.*;

public class Invertirunnumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        String texto = String.valueOf(num);

        for(int i = texto.length()-1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
}