import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {

        int result = molt(90, 3);
        System.out.println("il risultato è: " + result);
        printMolt(30, 60);

        String test = conc("ciao", 2);
        System.out.println("la concatenzaione è: " + test);
        String[] instruments = new String[5];
        System.out.println(Arrays.toString(myArr(instruments, "elettrica")));
    }




    public static int molt(int num1, int num2) {
        return num1 * num2;

    }

    public static void printMolt(int num1, int num2) {

        System.out.println("La moltiplicazione è: " + molt(num1, num2));


    }

    public static String conc(String elem1, int elem2) {

        return elem1 + elem2;
    }

    public static String[] myArr(String[] array, String str1) {
    array = new String[5];

    return array= new String[]{"chitarra", "ukulele",  str1, "dobro", "basso", "acustica"};

    }
}