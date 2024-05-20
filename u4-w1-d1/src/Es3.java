public class Es3 {
    public static void main(String[] args) {

        System.out.println("il perimetro del rettangolo è " +perimetroRettangolo(2.5, 7.5) );
        System.out.println("il risultato è: " + pariDispari(5));
        System.out.println("l'area del triangolo è " + areaTriangolo(15.0, 20.0, 25.0));
    }

    public static double perimetroRettangolo(double num1, double num2) {

        return ((num1 * 2) +(num2 * 2));
    }

    public static int pariDispari(int num3) {

       if (num3 % 2 == 0) {
           return  0;
       } else return 1;
    }

    public static double areaTriangolo(double a, double b, double c) {
        double p= (a + b + c) /2;
        return Math.sqrt(p* (p-a) * (p-b) * (p-c) );
    }
}
