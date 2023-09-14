import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount() + "\n");

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        System.out.println("Zoo Habitat is " + Cat.getHabitat());
        System.out.println("Max lives = " + Cat.MAX_LIVES);

        System.out.println("\n" + Cat.getCatCount() + "\n");

        myCat = new Cat();
        myCat.meeeooh();
        myCat.name = "Oliver";
        myCat.age = 4;
        System.out.println("Zoo Habitat is " + Cat.getHabitat());
        System.out.println("Max lives = " + Cat.MAX_LIVES);

        System.out.println("\n" + Cat.getCatCount());

        myCat = new Cat();
        myCat.moooo();
        myCat.name = "Garfield";
        myCat.age = 1;
        System.out.println("Zoo Habitat is " + Cat.getHabitat());
        System.out.println("Max lives = " + Cat.MAX_LIVES);

        System.out.println("\n" + Cat.getCatCount());

        ArrayList<Cat> catList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Cat cat = new Cat("cat" + i);
            catList.add(cat);
        }
        System.out.println(catList);

    }
}