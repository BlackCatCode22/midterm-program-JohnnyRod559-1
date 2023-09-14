public class Cat {
    public  Cat(String name){
        this.name =name ;
    }



    public static String Habitat = "Alley";
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;
    int deaths;
    String catSound = "this is how my cat sounds"; // do in main myCat.catSound instead of making in the Class



    public void meow(){
        System.out.println("Meow " + catSound);
    }
    public void meeeooh(){
        System.out.println("meeeooh " + catSound);
    }


    public void moooo(){
        System.out.println("Moooo " + catSound);
    }

    public Cat (){
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    public static int getCatCount(){

        return catCount;
    }
    public static String getHabitat(){
        return Habitat;
    }


}
