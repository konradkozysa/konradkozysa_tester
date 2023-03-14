public class NotebookService {
    public static void main(String[] args) {
        int i = 0;
        while (i == 0){
            String userDeclaration = NootebookDialogs.userDeclar();
            switch (userDeclaration) {
                case "N":
                    System.out.println("Dziekuje");
                    i++;
                    break;
                case "T":
                    String brand = NootebookDialogs.getBrand();
                    int price = NootebookDialogs.getPrice();
                    int weight = NootebookDialogs.getWeight();
                    int year = NootebookDialogs.getYear();
                    Notebook notebook = new Notebook(brand, weight, price, year);
                    notebook.checkWeight();
                    notebook.checkPrice();
                    notebook.summary();
            }
        }
    }
}
