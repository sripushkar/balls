public class Cat extends Pet implements Treatable {
    private boolean hasStripes;

    public Cat(String n, int a, int p, boolean s) {
        super(n, a, p);
        hasStripes = s;
    }

    public Cat(boolean s) {
        this("Purrfect", 4, 9, s);
    }

    public boolean getStripes() {
        return hasStripes;
    }

    public void setStripes(boolean s) {
        hasStripes = s;
    }

    public void playWith(Pet p) {
        if (p instanceof Cat) {
            Cat c = (Cat) p;
            if (this.hasStripes == c.getStripes()) {
                this.setPainLevel(this.getPainLevel() - 4);
                System.out.println("“Meow! I love playing with other cats with the same pattern as me");
            } else {
                this.setPainLevel(this.getPainLevel() - 2);
                System.out.println("“Meow! I like playing with other cats without the same pattern as me");
            }
        }
        if (p instanceof Dog) {
            Dog d = (Dog) p;
            this.setPainLevel(this.getPainLevel() + 1);
            System.out.printf("Meow. Go away %s! I don't like playing with Dogs!", d.getName());
        }
    }

    public void treat() {
        this.setPainLevel(this.getPainLevel() - 1);
    }

    public String toString() {
        return super.toString() + String.format(" My age in human years is %d.\n", Treatable.convertCatToHumanYears(this.getAge()));
    }

    public boolean equals(Object o) {
        if (!(o instanceof Cat)) {
            return false;
        }
        Cat c = (Cat) o;
        return (this.getName().equals(c.getName()) && this.getAge() == c.getAge() && this.getPainLevel() == c.getPainLevel() && this.hasStripes == c.getStripes());
    }
}
