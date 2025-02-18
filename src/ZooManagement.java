import java.util.Scanner;
<<<<<<< HEAD

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();
=======
import java.util.Arrays;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();
>>>>>>> d06a318 (Prosit 2)

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide !");
            scanner.next();
        }
<<<<<<< HEAD
        nbrCages = scanner.nextInt();

        scanner.close();

        System.out.println(zooName + " comporte " + nbrCages + " cages");
=======
        int nbrCages = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez la ville du zoo : ");
        String city = scanner.nextLine();

        Zoo myZoo = new Zoo(zooName, city, nbrCages);

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

        scanner.close();
>>>>>>> d06a318 (Prosit 2)
    }
}