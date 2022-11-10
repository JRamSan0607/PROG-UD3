public class ActividadMultiplos {

    //Una columna
    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++) {
        System.out.println ("Tabla de multiplicar del " + i);
            for (int tabla=1; tabla<=10; tabla++) {
            System.out.println ("| " + i +" x " + tabla +" = " + i*tabla + " |");
            }
            System.out.println("|===============|");
        }
    
    //Por columnas
    for (int i = 1; i<=10; i++) {
        System.out.println("Tabla del " + "\t");
    }
    for (int i = 1; i <=10; i++) {
        for (int j=1; j<=10; j++) {
            System.out.println (j + "x" + i + "=" + i*j + "\t");
        }
        System.out.println("\n");
        }

    }
}
