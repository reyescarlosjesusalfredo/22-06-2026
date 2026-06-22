public class Omitir {
    public static void main(String[] args) {

        String texto = "Hola Mundo Java";

        for(int i = 0; i < texto.length(); i++) {

            if(texto.charAt(i) == ' ') {
                continue;
            }

            System.out.print(texto.charAt(i));
        }
    }
}