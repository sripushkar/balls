public class Narwhal extends Pet {
    private int hornLength;

    public Narwhal(String n, int a, int p, int h) {
        super(n, a, p);
        hornLength = h;
    }

    public Narwhal() {
        this("Jelly", 19, 2, 7);
    }

    public int getHornLength() {
        return hornLength;
    }

    public void playWith(Pet p) {
        if (p instanceof Narwhal) {
            System.out.println("Who needs dogs and cats when we have each other");
            this.setPainLevel(this.getPainLevel() - 2);
        } else {
            System.out.println("I live in the ocean so I can't play with you");
            this.setPainLevel(this.getPainLevel() + 1);
        }
    }

    public String toString() {
        return super.toString() + String.format(" I have a horn that is %d feet long.\n", hornLength);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Narwhal)) {
            return false;
        }
        Narwhal n = (Narwhal) o;
        return ((this.getName().equals(n.getName())) && (this.getAge() == n.getAge()) && (this.getPainLevel() == n.getPainLevel()) && (this.hornLength == n.getHornLength()));
    }
}
