public class DibujarEnConsola {
    public static void main(String[] args) {
        String Dibujo = "*";
        for(int i=1; i<=5; i++) {
            System.out.println(Dibujo);
            Dibujo = Dibujo + "*";
        }
    }
}
