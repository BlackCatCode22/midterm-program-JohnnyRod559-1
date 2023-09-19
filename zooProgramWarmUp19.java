import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class zooProgramWarmUp19 {
    // Create the genUniqueIDFunction
    //values for theSpecies
    //hyena
    //lion
    //tiger
    //bear
    String genUniqueID(String theSpecies   ){
        if (theSpecies.equals("lion")) {



        }

    }

    public static void main(String[] args) {
        // declare a variable for the filepath
        String filePath = "C:\\Users\\Johnny\\JavaFiles\\arrivingAnimals.txt";




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
                Animal.animalCount++;


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
        myNewAnimal.desc = " this is my description";
        myNewAnimal.birthSeason = "";
        myNewAnimal.color = "";
        myNewAnimal.weight = "";
        myNewAnimal.origin01 = "";
        myNewAnimal.origin02 = "";
        System.out.println("\n\n the desc of the new animal is: " + myNewAnimal.desc);



    }

    }
