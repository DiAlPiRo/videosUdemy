import javax.swing.*;

public class sistemasNumericos {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Ingresar un numero entero");
        int numeroReal=Integer.parseInt(numero);
        System.out.println("Nuestro numero es: "+numeroReal);
        String numeroBinario=Integer.toBinaryString(numeroReal);
        System.out.println("Numero en binario: "+numeroBinario);
        System.out.println("Numero en hexadecimal: "+Integer.toHexString(numeroReal));
        System.out.println("Numero en octal: "+Integer.toOctalString(numeroReal));
        String resultados="Nuestro numero es: "+numeroReal+"\nNumero en hexadecimal: "+Integer.toHexString(numeroReal)+"\nNumero en binario: "+numeroBinario+"\nNumero en octal: "+Integer.toOctalString(numeroReal);
        JOptionPane.showMessageDialog(null, resultados);


    }
}
