public class Exer02 {
    public static void main(String[] args) {

        String texto = "O meu nome é Pedro, tenho 19 anos, estudo Engenharia de Software!";

        int quantidade = contarLetraA(texto);

        System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");
    }

    public static int contarLetraA(String texto) {
        int contador = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
}
