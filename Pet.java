//I worked on the homework assignment alone, using only course materials.
public abstract class Pet {
    private String name;
    private int age;
    private int painLevel;

    public Pet(String n, int a, int p) {
        name = n;
        if (a > 100) {
            age = 100;
            return;
        } else if (a < 1) {
            age = 1;
            return;
        }
        age = a;
        if (p > 10) {
            painLevel = 10;
            return;
        } else if (p < 1) {
            painLevel = 1;
            return;
        }
        painLevel = p;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 100) {
            age = 100;
            return;
        } else if (i < 1) {
            age = 1;
            return;
        }
        age = i;
    }

    public int getPainLevel() {
        return age;
    }

    public void setPainLevel(int i) {
        if (i > 10) {
            painLevel = 10;
            return;
        } else if (i < 1) {
            painLevel = 1;
            return;
        }
        painLevel = i;
    }

    abstract void playWith(Pet p);

    public String toString() {
        return String.format("My name is %s and I am %d. On a scale of one to ten my pain level is %d.", name, age, painLevel);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pet)) {
            return false;
        }
        Pet p = (Pet) o;
        return this.getName().equals(p.getName()) && this.getAge() == p.getAge() && this.getPainLevel() == p.getPainLevel();
    }
}