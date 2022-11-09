public class Operaciones {
/**
 * 20/10/2022 - [JRS]
 */
    
    final static int MAX = Integer.MAX_VALUE;
    public static void main (String [] args){
    /*Integer a,b,c */
    /*Realizar la operación a+b*c para que Resultado = 20 */
    Integer a;
    a = 2;
    Integer b;
    b = 3;
    Integer c;
    c = 4;

    Integer Resultado1 = (a+b)*c;
    System.out.println("Este resultado es" + " " + Resultado1);

    /*Hacer la operación a^b */
    double Resultado2 = (int) Math.pow(a,b);
    System.out.println("El resultado de la potencia de a^b es igual a" + " " + Resultado2);

    /*Buscar todos los numeros enteros posibles */
    /*Con final static, podemos crear constantes */
    System.out.println("Resultado de los enteros posibles =" + " " + MAX);

    /*Mostrar el numero maximo entre MAX y A */
    /*Como a es un Integer, y necesitamos un int, añadiendole delante un double, lo convertiremos en int */
    Double Resultado3 = Math.max((double)a, MAX);
    System.out.println("La búsqueda del número máximo entero entre a y MAX es =" + " " + Resultado3);
    }   
}
