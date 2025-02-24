class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {
        this.family = "Unknown";
        this.name = "Unknown";
        this.age = 0;
        this.isMammal = false;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    @Override
    public String toString() {
        return "Animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}