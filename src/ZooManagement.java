import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.print("Entrez la ville du zoo : ");
        String city = scanner.nextLine();

        Zoo myZoo = new Zoo(zooName, city);

        Animal lion = new Animal("Feline", "Lion", 5, true);
        myZoo.addAnimal(lion);

        myZoo.displayZoo();
        myZoo.displayAnimals();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        myZoo.addAnimal(tiger);

        System.out.println("Searching for Tiger: " + myZoo.searchAnimal(tiger));

        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();

        Zoo zoo1 = new Zoo("Zoo1", "City1");
        Zoo zoo2 = new Zoo("Zoo2", "City2");

        zoo1.addAnimal(new Animal("Feline", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Reptile", "Snake", 2, false));

        zoo2.addAnimal(new Animal("Feline", "Tiger", 4, true));

        Zoo bestZoo = Zoo.comparerZoo(zoo1, zoo2);
        if (bestZoo != null) {
            System.out.println("The zoo with the most animals is: " + bestZoo.name);
        }

        scanner.close();
    }
}