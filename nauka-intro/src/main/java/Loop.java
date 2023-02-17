public class Loop {
    public static void main(String[] args) {
    String[] carBrands = new String[] {"Audi", "BMW", "VW"};
    String[] audiModels = new String[] {"A3", "A4", "A6"};
    String[] bmwModels = new String[] {"Seria 3", "Seria 4", "Seria 5"};
    String[] vwModels = new String[] {"Golf", "Jetta", "Passat"};

    for (int i = 0; i < carBrands.length; i++) {
        if (carBrands[i] == "Audi") {
            for (int j = 0; j < audiModels.length; j++) {
                System.out.println(carBrands[i]+" "+audiModels[j]);
                }
            } else if (carBrands[i] == "BMW") {
            for (int j = 0; j < bmwModels.length; j++) {
                System.out.println(carBrands[i] + " " + bmwModels[j]);
                }
            } else if (carBrands[i] == "VW") {
            for (int j = 0; j < vwModels.length; j++) {
                System.out.println(carBrands[i] + " " + vwModels[j]);
                }
            } else {
            System.out.println("Nie ma takiego modelu");
            }
        }
    }
}
