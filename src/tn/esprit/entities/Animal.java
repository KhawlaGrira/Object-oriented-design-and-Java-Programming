package tn.esprit.entities;

public sealed class Animal permits Aquatic, Terrestrial {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("The age must a positive number");
        } else {
            this.age = age;
        }

    }

    public boolean isMammal() {
        return this.isMammal;
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{family='" + this.family + "', name='" + this.name + "', age=" + this.age + ", isMammal=" + this.isMammal + "}";
    }
}
