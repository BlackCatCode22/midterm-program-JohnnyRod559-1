import java.util.Date;

public class Animal {
    public String animalID;
    public String animalName;
    public String animalDesc;
    public String animalAge; // optional
    public String animalBirthSeason;
    public Date animalBirthdate;
    public String animalGender;
    public String animalWeight;
    public String animalColor;
    public String origin;




    private static int animalCount = 0;
    public Animal(){
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalDesc(String animalDesc) {
        this.animalDesc = animalDesc;
    }

    public void setAnimalAge(String animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public void setAnimalBirthSeason(String animalBirthSeason) {
        this.animalBirthSeason = animalBirthSeason;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public void setAnimalWeight(String animalWeight) {
        this.animalWeight = animalWeight;
    }

    public void setOrigin(String origin1) {
        this.origin = origin1;
    }



    public String getAnimalDesc() {
        return animalDesc;
    }

    public String getAnimalAge() {
        return animalAge;
    }

    public String getAnimalGender() {
        return animalGender;
    }

    public String getAnimalBirthSeason() {
        return animalBirthSeason;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public String getAnimalWeight() {
        return animalWeight;
    }

    public String getOrigin() {
        return origin;
    }


}
