public class Vet {
    public static void inspectPet(Pet pet) {
        System.out.print(pet.toString());
        if (pet instanceof Dog) {
            Dog d = (Dog) pet;
            d.bark();
        }
    }

    public static void treatPet(Pet pet) {
        if (pet instanceof Treatable) {
            System.out.printf("Welcome to the vet %s", pet.getName());
            if (pet instanceof Dog) {
                Dog d = (Dog) pet;
                d.treat();
                pet.setPainLevel(d.getPainLevel());
                System.out.println("Wow what a cute dog!");
                giveDogTreat(d);
                pet.setPainLevel(d.getPainLevel());
            }
            if (pet instanceof Cat) {
                Cat d = (Cat) pet;
                d.treat();
                pet.setPainLevel(d.getPainLevel());
            }
        } else {
            System.out.printf("Sorry, we cannot treat %s", pet.getName());
        }
    }

    public static void giveDogTreat(Dog dog) {
        dog.setPainLevel(dog.getPainLevel() - 2);
    }

}
