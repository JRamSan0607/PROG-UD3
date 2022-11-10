public class ActividadRombo {
    public static void main(String[] arguments) {
        char hueco = ' ';
        char rombo = 'M';
        for(int i=1; i<=5; i++) {
            for(int huecos=5 - i; huecos > 0; huecos--)
                System.out.print(hueco);
            for(int lineas = 1; lineas < 2 * i; lineas++)
                System.out.print(rombo);
            System.out.println("");
        }
        for(int i = 4; i >= 1; i--) {
            for(int huecos = 5 - i; huecos > 0; huecos--)
                System.out.print(hueco);
            for(int lineas = 1; lineas < 2 * i; lineas++)
                System.out.print(rombo);
            System.out.println("");
        }
    }
}