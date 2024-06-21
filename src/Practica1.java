import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Que bebida desea");
        System.out.println("1 - Cafe");
        System.out.println("2 - Gaseosa");
        System.out.println("3 - Vino");
        System.out.println("4 - Mate");
        int bebida;
        bebida = cap.nextInt();

        switch (bebida) {
            case 1:
                System.out.println("Buenisima elección, de paso comina con el curso de Java");
                break;
            case 2:
                System.out.println("Buenisima elecció, de paso comina con el curso de Java");
                break;
            case 3:
                System.out.println("Buenisima elecció, de paso comina con el curso de Java");
                break;
            case 4:
                System.out.println("Buenisima elecció, de paso comina con el curso de Java");
                break;
            default: System.out.println("No vendemos esa bebida");;
        }

        System.out.println("Disfrute de su bebida");
        cap.close();

    }
}
