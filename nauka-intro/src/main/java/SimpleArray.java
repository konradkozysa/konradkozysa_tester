public class SimpleArray {
    public static void main(String [] arag) {
        String[] movies = new String[] {"SW 1", "SW 2","SW 3"};

        String[] cars = new String[3];
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "VW";

        System.out.println(movies[0]);
        System.out.println(movies[1]);
        System.out.println(movies[2]);
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        int numberOfMovie = movies.length;
        int numberOfCar = cars.length;

        System.out.println("Tablica Movies zawiera "+numberOfMovie+" elementow");
        System.out.println("Tablica Cars zawiera "+numberOfCar+" elementow");
    }
}
