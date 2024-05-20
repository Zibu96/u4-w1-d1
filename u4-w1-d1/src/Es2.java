import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ciao, inserisci il tuo strumento preferito");
        String instrument1 = sc.nextLine();

        System.out.println("Adesso uno strumento che vorresti imparare a suonare");
        String instrument2 = sc.nextLine();

        System.out.println("Ora quello che meno ti piace tra tutti");
        String instrument3 = sc.nextLine();

        System.out.println( conca(instrument1, instrument2, instrument3));
        System.out.println( conca(instrument3, instrument2, instrument1));


        sc.close();


    }

    public static String conca(String elem1, String elem2, String elem3){

        return "amo la"  + elem1  + "vorrei imparare a suonare"  + elem2 +  "non suonerei mai" + elem3;
    }
}
