class Aquatic extends Animal {
    private String habitat;

    public Aquatic() {
        super("Aquatic", "Unknown", 0, false);
        this.habitat = "Unknown";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'}";
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Aquatic aquatic = (Aquatic) obj;
        return getName().equals(aquatic.getName()) && getAge() == aquatic.getAge() && habitat.equals(aquatic.habitat);
    }
}