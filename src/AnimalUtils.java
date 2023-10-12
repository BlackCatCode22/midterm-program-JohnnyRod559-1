import java.text.SimpleDateFormat;
import java.util.*;

public class AnimalUtils {

    public static String genUniqueId(String species) {
        switch (species.toLowerCase()) {
            case "hyena":
                return "Hy" + String.format("%02d", Hyena.getNumOfHyenas());
            case "lion":
                return "Li" + String.format("%20d", Lion.getNumberOfLions());
            case "tiger":
                return "Ti" + String.format("%20d", Tiger.getNumOfTiger());
            case "bear":
                return "Br" + String.format("%20d", Bear.getNumberOfBears());

            default:
                throw new IllegalArgumentException("Unsupported species: " + species);
        }
    }

    public static Date calculateBirthdate(int age, String birthSeason){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy", Locale.US);

        // Get today's date:
        Date today = calendar.getTime();

        // Calculate the birth year based on the current date and age
        calendar.add(Calendar.YEAR, -age);
        Date birthdate = calendar.getTime();

        // Calculate the birth month and day based on the birth season
        if (birthSeason.contains("spring")) {
            // Set the birthdate to March 31st of the birth year
            calendar.set(Calendar.MONTH, Calendar.MARCH);
            calendar.set(Calendar.DAY_OF_MONTH, 31);
        } else if (birthSeason.contains("fall")) {
            // Set the birthdate to September 30th of the birth year
            calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
            calendar.set(Calendar.DAY_OF_MONTH, 30);
        } else {
            // You can add more cases for other seasons if needed
        }

        // Set the final birthdate with the calculated month and day
        birthdate = calendar.getTime();

        return birthdate;
    }
    public static String getRandomName (List< String > names, Set< String > usedNames){
        if (names.isEmpty()) {
            return "Unknown Name";
        }
        Random random = new Random();
        String randomName;
        do {
            int randomIndex = random.nextInt(names.size());
            randomName = names.get(randomIndex);
        } while (usedNames.contains(randomName));

        usedNames.add(randomName);
        return randomName;


    }
   /* public static Animal createHyena(String name) {
        Animal hyena = new Animal();
        hyena.setAnimalDesc(name);

        // You can set other attributes like age, gender, birthdate, color, etc., based on the arriving animals
        // Example:
        hyena.setAnimalAge("4 years");

        // Check if birthSeason is null, and set it to a default value if needed
        String birthSeason = hyena.getAnimalBirthSeason();
        if (birthSeason == null) {
            birthSeason = "unknown birth season"; // You can set a default value here
            hyena.setAnimalBirthSeason(birthSeason);

            // Calculate and set the birthdate using the current date minus years old
            int age = ArrivingAnimals.extractAge(name);
            Date birthdate = calculateBirthdateFromAge(age);
            hyena.setAnimalBirthdate(birthdate);
        } else {
            // Calculate and set the birthdate based on the provided birth season
            int age = ArrivingAnimals.extractAge(name);
            Date birthdate = AnimalUtils.calculateBirthdate(age, birthSeason);
            hyena.setAnimalBirthdate(birthdate);
        }

        // Set other attributes
        hyena.setAnimalColor("tan color");
        hyena.setAnimalGender("female");
        hyena.setAnimalWeight("70 pounds");
        hyena.setOrigin("from Friguia Park, Tunisia; arrived Sept 27, 2022");

        return hyena;
    }*/

    // Calculate birthdate from age in years
    public static Date calculateBirthdateFromAge(int age) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -age);
        return calendar.getTime();
    }
}

