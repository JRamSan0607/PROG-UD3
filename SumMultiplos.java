public class SumMultiplos {
    public static void main(String[] args) {
        int n = 20;
        int suma5 = 0;
        int suma3 = 0;
        for (int i = 0; i<=n-10; i++) {
            suma5 = suma5 + (5*i);
            suma3 = suma3 + (3*i);
        }
        System.out.println(suma5 + suma3);
    }
}
