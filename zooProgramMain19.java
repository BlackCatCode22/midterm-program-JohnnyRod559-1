import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class zooProgramMain19 {
    // Create the genUniqueIDFunction
    //values for theSpecies
    //hyena
    //lion
    //tiger
    //bear
    String genUniqueID(String theSpecies   ){
        if (theSpecies.equals("Hyena")) {



        }
        return "the name";
    }

    public static void main(String[] args) {
        System.out.println("\n Welcome to my Zoo Program! \n");
        // declare a variable for the filepath
        String filePath = "C:\\Users\\Johnny\\JavaFiles\\arrivingAnimals.txt";

        // how many animals do we have
        System.out.println("\n We begin with " + Animal.animalCount + " animals in our Zoo\n");


        // create an Array list to hold the animal objects
        ArrayList<Animal> animalList = new ArrayList<>();

//surround the buffered reader with a try and catch block
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String myLine;

            // create an Array list to hold the animal objects
            // use outside scope of try block : ArrayList<Animal> animalList = new ArrayList<>();

            // create a while loop tp gp through the file
            while ((myLine = reader.readLine()) != null) {
                // read out file
                //System.out.println(myLine);
                String[] myArray = myLine.split(",");


                Animal anyOldAnimal = new Animal();

                // increment the static animal count
               // Animal.animalCount++;


                anyOldAnimal.desc =  myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight =  myArray[3];
                anyOldAnimal.origin01 = myArray[4];
                anyOldAnimal.origin02 = myArray[5];

                // add the newly created animal object to the array list
                animalList.add(anyOldAnimal);


            }

            // ensure you close the reader
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        } // we are done with the text file

        // output the ArrayList
        for (Animal animal : animalList){
            System.out.println(animal.desc);
            // get the species


            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.origin01);
            System.out.println(animal.origin02);
            System.out.println("\n\n");
        }
        System.out.println(" The number of animals is: " + Animal.animalCount);

        //create an animal object from the animal class
        Animal myNewAnimal = new Animal();
        // fill the object's data fields
        myNewAnimal.name = "";
        myNewAnimal.desc = " this is my description";
        myNewAnimal.birthSeason = "";
        myNewAnimal.color = "";
        myNewAnimal.weight = "";
        myNewAnimal.origin01 = "";
        myNewAnimal.origin02 = "";
        System.out.println("\n\n the desc of the new animal is: " + myNewAnimal.desc);

        System.out.println("\n there are now " + Animal.animalCount + " animals");

        // create a hyena
        Hyena myHyena = new Hyena();
        // give the new hyena a name
        //myHyena.name = "Joker";
        myHyena.birthSeason = "summer";
       // myHyena.makeNoise();
        myHyena.weight = "100";

        Hyena myHyena2 = new Hyena();
        // give the new hyena a name
        myHyena2.name = "Zoro";
        myHyena2.birthSeason = "summer";
        // myHyena.makeNoise();
        myHyena2.weight = "90";


        System.out.println("\n My new hyena is named: " + myHyena2.name);
        myHyena.makeNoise();
        System.out.println("He makes this noise: " + myHyena.makeNoise02());

        System.out.println("\nWe have " + Hyena.numOfHyenas + " Hyenas");

        Bear myBear = new Bear();
        System.out.println("\nHe makes this noise: " + myBear.makeNoise02());
        myBear.name = "toby";
        System.out.println(myBear.name);

        System.out.println("\n We now have " + Animal.animalCount + " animals!");

        Hyena.inputHyenaNames();
       // show the hyena names
       Hyena.listOut();

        System.out.println("\n We now have " + Hyena.numOfHyenas + " Hyenas!");









    }

    }
