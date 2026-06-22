public class Omitirnegativos {
    public static void main(String[] args) {

        int[] numeros = {5,-3,8,-2,10};

        for(int n : numeros) {

            if(n < 0) {
                continue;
            }

            System.out.println(n);
        }
    }
}