public class Notebook {
    int weight;
    int price;
    int year;
    String brand;
    public Notebook(String brand, int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.brand = brand;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is very light");
        } else if (this.weight >= 800 && this.weight < 1600) {
            System.out.println("This weight is good");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void summary() {
        if (this.year < 2015 && this.price > 1000) {
            System.out.println("This notebook is too expensive");
        } else if (this.year >= 2015 && this.year < 2020 && this.price >= 1500) {
            System.out.println("This notebook is expensive");
        } else {
            System.out.println("Price is good");
        }
    }
}
