public class UniqueIdGenerator {

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
}

