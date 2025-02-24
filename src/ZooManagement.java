public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("My Zoo", "My City");

        Aquatic dolphin = new Dolphin("Aquatic", "Dolphin", 10, true, "Ocean", 45.5f);
        Aquatic penguin1 = new Penguin("Aquatic", "Penguin1", 3, true, "Antarctic", 100.0f);
        Aquatic penguin2 = new Penguin("Aquatic", "Penguin2", 5, true, "Antarctic", 150.0f);

        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        zoo.displaySwim();

        System.out.println("Max penguin swimming depth: " + zoo.maxPenguinSwimmingDepth());

        zoo.displayNumberOfAquaticsByType();

        Aquatic penguin3 = new Penguin("Aquatic", "Penguin1", 3, true, "Antarctic", 100.0f);
        System.out.println("Penguin1 equals Penguin3: " + penguin1.equals(penguin3));
    }
}