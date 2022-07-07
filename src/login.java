import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String usuario="Abraham";
        String contraseña="12345";
        Scanner entrada=new Scanner(System.in);
        System.out.println("INTRODUCE TU NOMBRE DE USUARIO");
        String u=entrada.nextLine();
        System.out.println("INTRODUCE TU CONTRASEÑA");
        String p=entrada.nextLine();

        if(usuario.equals(u)&&contraseña.equals(p)){
            System.out.println("DATOS AUTENTICADOS. BIENVENIDO");
        }
        else {
            System.out.println("DATOS ERRONEOS. INTENTE DE NUEVO");
        }
    }
}
