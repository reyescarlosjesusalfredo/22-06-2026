public class PalabrasMenores {
    public static void main(String[] args) {

        String[] palabras = {"yo","java","es","genial","de","programar"};

        for(String p : palabras) {

            if(p.length() < 3) {
                continue;
            }

            System.out.println(p);
        }
    }
}