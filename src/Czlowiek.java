import java.util.Scanner;

public abstract class Czlowiek {
    public abstract void jedz();
    public abstract void pij();

    public Czlowiek() {
    }

    public static void ileLat()
    {
        System.out.println("Ile lat ma czlowiek? ");
        Scanner sc = new Scanner(System.in);
        int lata = sc.nextInt();
        System.out.println("Czlowiek ma "+ lata + " lat");
    }
    public static void cechy()
    {
        String [] cechyCzlowieka = new String [3];

        System.out.println("Wprowadz trzy cechy czlowieka: ");
        for(int i=0;i<3;i++)
        {
            Scanner wprowadzCeche = new Scanner(System.in);
            cechyCzlowieka[i]= wprowadzCeche.toString();
        }
        System.out.println("Cechy: ");
        for(int i=0;i<3;i++)
        {
            System.out.println(cechyCzlowieka[i]);
        }
    }


}
