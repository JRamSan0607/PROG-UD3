public class EjemploConstante {
    public static void main(String[]args) {
        //Declarar x, y
        int x = 2, y = 3;
        //Crear bloque donde se imprime x
        System.out.println(x);
        //Variable Z
        int z = 4;
        //Bloque dentro
        {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
        //Crear bloque donde se imprime y

         {
            System.out.println(y);
            System.out.println(z);
        }
    }
}
