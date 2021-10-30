public class Dog extends Pet implements Treatable {
    private String breed;

    public Dog(String n, int a, int p, String b) {
        super(n, a, p);
        breed = b;
    }

    public Dog(String b) {
        this("Buzz", 6, 3, b);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public void playWith(Pet p) {
        if (p instanceof Dog) {
            int oldPain = this.getPainLevel();
            this.setPainLevel(this.getPainLevel() - 3);
            System.out.printf("Woof! I love playing with other dogs so much that my pain level went from %d to %d\n", oldPain, this.getPainLevel());
        }

        if (p instanceof Cat) {
            Cat c = (Cat) p;
            if (c.getStripes()) {
                this.setPainLevel(this.getPainLevel() + 2);
                System.out.println("AHHH! I thought you were a tiger!");
            } else {
                int oldPain = this.getPainLevel();
                this.setPainLevel(this.getPainLevel() - 1);
                System.out.printf("Woof. Cats without stripes are okay since they made my pain level go from %d to %d\n", oldPain, this.getPainLevel());
            }
        }
    }

    public void treat() {
        this.setPainLevel(this.getPainLevel() - 3);
    }

    public void bark() {
        System.out.println("bark bark");
    }

    public String toString() {
        return String.format("My name is %s, I am %d, and I am a %s. On a scale of one to ten my pain level is %d. My age in human years is %d.\n", this.getName(), this.getAge(), breed, this.getPainLevel(), Treatable.convertDogToHumanYears(this.getAge()));
    }

    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog d = (Dog) o;
        return (this.getName().equals(d.getName()) && this.getAge() == d.getAge() && this.getPainLevel() == d.getPainLevel() && this.breed.equals(d.getBreed()));
    }
}