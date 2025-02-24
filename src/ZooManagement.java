public class ZooManagement {
    public static void main(String[] args) {
        Aquatic aquaticAnimal = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        Aquatic aquatic1 = new Aquatic("Aquatic", "Fish", 2, false, "Ocean");
        Dolphin dolphin1 = new Dolphin("Aquatic", "Dolphin", 10, true, "Ocean", 45.5f);
        Penguin penguin1 = new Penguin("Aquatic", "Penguin", 3, true, "Antarctic", 100.0f);

        System.out.println(aquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        System.out.println(aquatic1);
        System.out.println(dolphin1);
        System.out.println(penguin1);

        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();
    }
}