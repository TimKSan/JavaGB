package Seminars.Sem6;

public class main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", "Mops", 10, "01.01.2013", 5, true);
        Dog dog2 = new Dog("Bubble", "Germany", 5, "01.05.2018", 3, false);
        Dog dog3 = new Dog("Guffi", "Doberman", 7, "13.07.2016", 8, true);

        DogCleaner dogcl = new DogCleaner();
        dogcl.checkdog(dog2);

    }
}
