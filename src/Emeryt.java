public class Emeryt extends Dorosly implements Podstawowy, Emerytura, Praca{
    @Override
    public void jedz() {
        System.out.println("Jem duzo");
    }

    public Emeryt() {
    }

    @Override
    public void pij() {
        System.out.println("Pije kakao");
    }

    @Override
    public void spij() {
        System.out.println("ZzZzZzZ");
    }

    @Override
    public void wstan() {
        System.out.println("Powstalem");
    }

    @Override
    public void zabawa() {
        System.out.println("Chodze na spacery");
    }

    @Override
    public void obowiazki() {
        System.out.println("Mam duzo obowiazkow");
    }

    @Override
    public void odbierzEmeryture() {
        System.out.println("Emeryt odebral emeryture ale interfejs zawsze czuwa");
    }
    @Override
    public void idzDoLekarza() {
        System.out.println("Wszystkie choroby zostaly wyleczone");
    }

    @Override
    public void pomodlSie(){
        System.out.println("Modlitwa");
    }

    @Override
    public void idzDoKosciola()
        {
            System.out.println("Emeryt poszedl do kosciola i jest sledzony przez interfejs");
        }

    @Override
    public void pracuj() {
        System.out.println("Pracuje");
    }

    @Override
    public void placPodatki() {
        System.out.println("Podatki oplacone");
    }

    @Override
    public void dostalesPodwyzke() {
        System.out.println("Dostalem podwyzke");
    }

    @Override
    public void dostalesAwans() {
        System.out.println("Awansowalem");
    }
}
