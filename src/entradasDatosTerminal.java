import javax.swing.*;
import java.util.Scanner;

public class entradasDatosTerminal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nuemro entero");
        int numeroReal=entrada.nextInt();
        System.out.println("Nuestro numero es: "+numeroReal);
        String numeroBinario=Integer.toBinaryString(numeroReal);
        System.out.println("Numero en binario: "+numeroBinario);
        System.out.println("Numero en hexadecimal: "+Integer.toHexString(numeroReal));
        System.out.println("Numero en octal: "+Integer.toOctalString(numeroReal));


    }
}
