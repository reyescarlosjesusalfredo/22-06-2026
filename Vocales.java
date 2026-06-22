import java.util.*;

public class Vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese texto: ");
        String texto = sc.nextLine();

        for(int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                System.out.println(c);
            }
        }
    }
}