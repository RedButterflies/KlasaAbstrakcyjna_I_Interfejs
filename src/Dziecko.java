import java.util.Scanner;

public abstract class Dziecko extends Czlowiek {

    public abstract void zabawa();

    public abstract void obowiazki();

    public static void wyglad()
    {
        System.out.println("Jaki kolor wlosow ma dziecko? ");
        Scanner wlosy =new Scanner(System.in);
        System.out.println("Jaki kolor oczu ma dziecko? ");
        Scanner oczy = new Scanner(System.in);
        System.out.println("Jaki jest wzrost dziecka? ");
        Scanner wzrost = new Scanner(System.in);

        System.out.println("Dziecko ma "+ wlosy.toString() +" kolor wlosow");
        System.out.println("Dziecko ma " + oczy.toString() + "kolor oczu");
        System.out.println("Dziecko ma "+ wzrost.nextInt() + "wzrostu");
    }
    public static void zabawiki()
    {
        System.out.println("Ile dziecko ma zabawek? ");
        Scanner ile = new Scanner(System.in);
        System.out.println("Dziecko ma "+ ile + "zabawek");

    }


}
