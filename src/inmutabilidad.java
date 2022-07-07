public class inmutabilidad {
    public static void main(String[] args) {
        String Saludo="Hola, gracias por la informacion";
        String Nombre="Abraham";
        String Nombre1="Abraham";
        String SaludoPersonalizado=Saludo+"Querido "+Nombre;
        String SaludoPersonalizado2=Saludo.concat("querido ").concat(Nombre);
        System.out.println(SaludoPersonalizado);
        System.out.println(SaludoPersonalizado2);


        Saludo=Saludo.transform(s -> {
            return s+"querido"+Nombre;
        });
        System.out.println(Saludo);
        Nombre1=Nombre1.replace("a", "A");
        System.out.println(Nombre1);
    }
}
