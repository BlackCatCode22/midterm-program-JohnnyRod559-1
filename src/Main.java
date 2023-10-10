import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;
        if (theSpecies.contains("Hyena")) {
            prefix = "Hy";

        }
        return prefix + Integer.valueOf(suffix);
    }

    public static void main(String[] args) {


        AnimalNames.loadNamesFromFile(); // Load names from the file

        // Access and print names for each species
        List<String> hyenaNames = AnimalNames.getNamesForSpecies("Hyena");
        List<String> lionNames = AnimalNames.getNamesForSpecies("Lion");
        List<String> bearNames = AnimalNames.getNamesForSpecies("Bear");
        List<String> tigerNames = AnimalNames.getNamesForSpecies("Tiger");

        System.out.println("\n");
        System.out.println("Hyena Names: " + hyenaNames);
        System.out.println("Lion Names: " + lionNames);
        System.out.println("Bear Names: " + bearNames);
        System.out.println("Tiger Names: " + tigerNames);
        System.out.println("\n");

        // Load arriving animals from a file (replace "filePath" with the actual file path)
        List<Animal> arrivingAnimals = ArrivingAnimals.loadArrivingAnimalsFromFile("C:\\Users\\Johnny\\JavaFiles\\arrivingAnimals.txt");

        // Create separate lists for each species
        List<Animal> hyenas = new ArrayList<>();
        List<Animal> lions = new ArrayList<>();
        List<Animal> bears = new ArrayList<>();
        List<Animal> tigers = new ArrayList<>();

        // Define a pattern to match the age (e.g., "4 year old")
        Pattern agePattern = Pattern.compile("(\\d+) year old");

        // Iterate through arriving animals and categorize them
        for (Animal animal : arrivingAnimals) {
            String animalDesc = animal.getAnimalDesc();

            if (animalDesc.contains("hyena")) {
                hyenas.add(animal);
            } else if (animalDesc.contains("lion")) {
                lions.add(animal);
            } else if (animalDesc.contains("bear")) {
                bears.add(animal);
            } else if (animalDesc.contains("tiger")) {
                tigers.add(animal);
            }
        }

        // Output the separate lists for each species without the "Animal Description" portion
        System.out.println("Hyenas:");
        for (Animal hyena : hyenas) {
            // Extract the age using regular expressions
            Matcher matcher = agePattern.matcher(hyena.getAnimalDesc());
            if (matcher.find()) {
                String age = matcher.group(1);
                System.out.println("Age: " + age + " years");
            }

            System.out.println("Birth Season: " + hyena.getAnimalBirthSeason());
            System.out.println("Color: " + hyena.getAnimalColor());
            System.out.println("Weight: " + hyena.getAnimalWeight());
            System.out.println("Origin: " + hyena.getOrigin());
            System.out.println(); // Add an empty line for separation
        }

        // Output the separate lists for each species without the "Animal Description" portion
        System.out.println("Lions:");
        for (Animal lion : lions) {
            // Extract the age using regular expressions
            Matcher matcher = agePattern.matcher(lion.getAnimalDesc());
            if (matcher.find()) {
                String age = matcher.group(1);
                System.out.println("Age: " + age + " years");
            }

            System.out.println("Birth Season: " + lion.getAnimalBirthSeason());
            System.out.println("Color: " + lion.getAnimalColor());
            System.out.println("Weight: " + lion.getAnimalWeight());
            System.out.println("Origin: " + lion.getOrigin());
            System.out.println(); // Add an empty line for separation
        }

        // Output the separate lists for each species without the "Animal Description" portion
        System.out.println("Bears:");
        for (Animal bear : bears) {
            // Extract the age using regular expressions
            Matcher matcher = agePattern.matcher(bear.getAnimalDesc());
            if (matcher.find()) {
                String age = matcher.group(1);
                System.out.println("Age: " + age + " years");
            }

            System.out.println("Birth Season: " + bear.getAnimalBirthSeason());
            System.out.println("Color: " + bear.getAnimalColor());
            System.out.println("Weight: " + bear.getAnimalWeight());
            System.out.println("Origin: " + bear.getOrigin());
            System.out.println(); // Add an empty line for separation
        }

        System.out.println("Tigers:");
        for (Animal tiger : tigers) {
            // Extract the age using regular expressions
            Matcher matcher = agePattern.matcher(tiger.getAnimalDesc());
            if (matcher.find()) {
                String age = matcher.group(1);
                System.out.println("Age: " + age + " years");
            }

            System.out.println("Birth Season: " + tiger.getAnimalBirthSeason());
            System.out.println("Color: " + tiger.getAnimalColor());
            System.out.println("Weight: " + tiger.getAnimalWeight());
            System.out.println("Origin: " + tiger.getOrigin());
            System.out.println(); // Add an empty line for separation
        }

    }
}
