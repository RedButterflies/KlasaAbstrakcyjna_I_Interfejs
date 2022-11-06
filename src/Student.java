public class Student extends Dorosly implements Podstawowy, Studia{

    @Override
    public void jedz() {
        System.out.println("Student caly czas je");
    }

    public Student() {
    }

    @Override
    public void pij() {
        System.out.println("Student wypil piwo");
    }

    @Override
    public void spij() {
        System.out.println("Student spi");
    }

    @Override
    public void wstan() {
        System.out.println("Student wstal");
    }

    @Override
    public void zabawa() {
        System.out.println("Student nie ma czasu na zabawe");
    }

    @Override
    public void obowiazki() {
        System.out.println("Student caly czas podaza za Sloncem");
    }

    @Override
    public void studiuj() {
        System.out.println("Student studiuje");

    }

    @Override
    public void nieIdzNaZajecia() {
        System.out.println("Student wagaruje");
    }

    @Override
    public void idzNaZajecia() {
        System.out.println("Student ciezko pracuje");
    }

    @Override
    public void idzNaImpreze() {
        System.out.println("Student poszedl na impreze");
    }
}
