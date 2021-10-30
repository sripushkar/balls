public interface Treatable {
    public static int convertDogToHumanYears(int dog_age) {
        return (int) Math.floor(16 * Math.log(dog_age) + 31);
    }

    public static int convertCatToHumanYears(int cat_age) {
        return (int) Math.floor(9 * Math.log(cat_age) + 18);
    }

    abstract void treat();
}
