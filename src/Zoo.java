class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private final int nbrAquaticCages = 10;
    private int animalCount = 0;
    private int aquaticAnimalCount = 0;

    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[nbrAquaticCages];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + ", animalCount=" + animalCount + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full. Cannot add more animals.");
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("Animal already exists in the zoo.");
                return false;
            }
        }
        animals[animalCount++] = animal;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animals[i];
            System.out.println("Name: " + animal.getName() + ", Family: " + animal.getFamily() + ", Age: " + animal.getAge());
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal not found.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }

    public boolean isZooFull() {

        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount)
            return z1;
        else if (z1.animalCount < z2.animalCount)
            return z2;
        else {
            System.out.println("Both zoos have the same number of animals.");
            return null;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticAnimalCount >= nbrAquaticCages) {
            System.out.println("Aquatic animal section is full. Cannot add more aquatic animals.");
            return;
        }
        aquaticAnimals[aquaticAnimalCount++] = aquatic;
    }

    public void displaySwim() {
        for (int i = 0; i < aquaticAnimalCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth)
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin)
                dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin)
                penguinCount++;
        }
        System.out.println("Number of dolphins: " + dolphinCount);
        System.out.println("Number of penguins: " + penguinCount);
    }
}