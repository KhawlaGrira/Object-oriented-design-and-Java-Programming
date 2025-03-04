package tn.esprit.entities;

public final class Terrestrial extends Animal {
    public int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", nbrLegs:" + this.nbrLegs;
    }
}