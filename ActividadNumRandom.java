import java.util.Random;

public class ActividadNumRandom {
    public static void main (String[]args) {
        int r = (int)(Math.random()*10+1);
        int numFin = 3;

            while (r != numFin) {
                r = (int)(Math.random()*10+1);
                System.out.println(r);
            }

    }
}
