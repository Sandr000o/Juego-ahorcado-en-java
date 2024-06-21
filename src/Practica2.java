import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);

        // Nos permite que le usuario escriba
        String palabraSecreta = "inteligencia";
        int intentoMaximos = 10;

        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }

        // Estructura de control_ Iterativa bucle

        while (!palabraAdivinada && intentos < intentoMaximos) {
            System.out.println("Palabra a adivinar : " + String.valueOf(letrasAdivinadas)+ "("+palabraSecreta.length()+ " letras)");
            System.out.println("Introduce una letra por favor : ");
            // Usamos la clase scanner para pedir una letra
            char letra = cap.next().charAt(0);

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto te quedan"+(intentoMaximos-intentos)+" intentos");
            }

           if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
            palabraAdivinada=true;
            System.out.println("Felicidades haz adivinado la palabra secreta : INTELIGENCIA");
           }
            
        }
        cap.close();
        
    }
}
