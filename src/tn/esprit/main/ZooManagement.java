package tn.esprit.main;

import tn.esprit.entities.Aquatic;
import tn.esprit.entities.Dolphin;
import tn.esprit.entities.Penguin;
import tn.esprit.entities.Terrestrial;

public class ZooManagement {
    public ZooManagement() {
    }

    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5F);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3F);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        dolphin.swim();
        penguin.swim();
        aquatic.swim();
    }
}