package tn.esprit.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", swimmingDepth:" + this.swimmingDepth;
    }
}
