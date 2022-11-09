public class ActividadMultiplos {
    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++) {
        System.out.println ("Tabla de multiplicar del " + i);
            for (int tabla=1; tabla<=10; tabla++) {
            System.out.println ("| " + i +" x " + tabla +" = " + i*tabla + " |");
            }
            System.out.println("|===============|");
        }
    }
}
