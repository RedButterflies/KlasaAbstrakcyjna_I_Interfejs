import java.util.Scanner;

public class Uczen extends Dziecko implements Podstawowy,Szkola{

    @Override
    public void jedz() {
        System.out.println("Jem");
    }

    public Uczen() {
    }

    @Override
    public void pij() {
        System.out.println("Pije wode");
    }

    @Override
    public void spij() {
        System.out.println("Uczen spi");
    }

    @Override
    public void wstan() {
        System.out.println("Uczen wstal");
    }

    @Override
    public void zabawa() {
        System.out.println("Bawie sie");
    }

    @Override
    public void obowiazki() {
        System.out.println("Nie mam obowiazkow");
    }

    @Override
    public void uczSie()
        {
            System.out.println("Wprowadz slowo: ");
            Scanner slowo= new Scanner(System.in);
            String slowoA;
            slowoA=slowo.next().toString();
            System.out.println("Nauczyles ucznia mowic: "+ slowoA);
        }

    @Override
    public void odrobLekcje() {
        System.out.println("Uczen odrobil lekcje");
    }

    @Override
    public void pojdzNaPrzerwe() {
        System.out.println("Uczen poszedl na przerwe");
    }

    @Override
    public void pojdzDoTablicy() {
        System.out.println("Uczen poszedl do tablicy");
    }

}
