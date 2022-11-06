import java.util.Scanner;

public abstract class Dorosly extends Czlowiek{
    public abstract void zabawa();
    public abstract void obowiazki();

    public static void czyJestWZwiaku()
    {
        System.out.println("Czy osoba dorosla jest w zwiazku? (wprowadz - jest/nie jest) ");
        Scanner czyJest = new Scanner(System.in);
        System.out.println("Osoba "+ czyJest.toString() + "w zwiazku");
    }
    public static void czyPracuje()
    {
        System.out.println("Cy osoba dorosla pracuje? (wprowadz - pracuje/nie pracuje");
        Scanner czyPracuje = new Scanner(System.in);
        System.out.println("Osoba dorosla "+ czyPracuje.toString());
    }



}
