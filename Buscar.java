public class Buscar {
    public static void main(String[] args) {

        int[] numeros = {5,8,12,20,30};

        int buscar = 20;

        for(int i = 0; i < numeros.length; i++) {

            if(numeros[i] == buscar) {
                System.out.println("Encontrado");
                break;
            }
        }
    }
}