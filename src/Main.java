public class Main {
    public static void main(String[] args) {
        Emeryt babciaStasia = new Emeryt();
        Student studentJacek = new Student();
        Uczen uczenTobiasz = new Uczen();

        System.out.println("WYWOLANIE BABCI");
        babciaStasia.jedz();
        babciaStasia.pij();
        babciaStasia.obowiazki();
        babciaStasia.zabawa();
        babciaStasia.odbierzEmeryture();
        babciaStasia.idzDoKosciola();
        babciaStasia.idzDoLekarza();
        babciaStasia.pomodlSie();

        System.out.println("WYWOLANIE STUDENTA JACKA");
        studentJacek.idzNaImpreze();
        studentJacek.jedz();
        studentJacek.pij();
        studentJacek.obowiazki();
        studentJacek.spij();
        studentJacek.idzNaZajecia();
        studentJacek.nieIdzNaZajecia();
        studentJacek.studiuj();
        studentJacek.wstan();
        studentJacek.zabawa();

        System.out.println("WYWOLANIE UCZNIA TOBIASZA");
        uczenTobiasz.jedz();
        uczenTobiasz.obowiazki();
        uczenTobiasz.odrobLekcje();
        uczenTobiasz.pij();
        uczenTobiasz.spij();
        uczenTobiasz.pojdzDoTablicy();
        uczenTobiasz.pojdzNaPrzerwe();
        uczenTobiasz.uczSie();
        uczenTobiasz.wstan();
        uczenTobiasz.zabawa();



    }
}