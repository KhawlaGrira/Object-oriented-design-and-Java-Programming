package tn.esprit.entities;

public class Zoo {
    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.nbrAnimals > z2.nbrAnimals ? z1 : z2;
    }

    public Animal[] getAnimals() {
        return this.animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("The Zoo name cannot be empty");
        } else {
            this.name = name;
        }

    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return this.nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + this.name + ", City: " + this.city + ", N° Cages: 25 N° animals: " + this.nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal) != -1) {
            return false;
        } else if (this.isZooFull()) {
            return false;
        } else {
            this.animals[this.nbrAnimals] = animal;
            ++this.nbrAnimals;
            return true;
        }
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = this.searchAnimal(animal);
        if (indexAnimal == -1) {
            return false;
        } else {
            for(int i = indexAnimal; i < this.nbrAnimals; ++i) {
                this.animals[i] = this.animals[i + 1];
            }

            this.animals[this.nbrAnimals] = null;
            --this.nbrAnimals;
            return true;
        }
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + this.name + ":");

        for(int i = 0; i < this.nbrAnimals; ++i) {
            System.out.println(this.animals[i]);
        }

    }

    public int searchAnimal(Animal animal) {
        int index = -1;

        for(int i = 0; i < this.nbrAnimals; ++i) {
            if (animal.getName() == this.animals[i].getName()) {
                return i;
            }
        }

        return index;
    }

    public boolean isZooFull() {
        return this.nbrAnimals == 25;
    }

    public String toString() {
        return "Name: " + this.name + ", City: " + this.city + ", N° Cages: 25 N° animals: " + this.nbrAnimals;
    }
}