public class NotebookService {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(notebook.weight);
        System.out.println(heavyNotebook.weight);
        System.out.println(oldNotebook.weight);
        System.out.println(notebook.price);
        System.out.println(heavyNotebook.price);
        System.out.println(oldNotebook.price);
        notebook.checkPrice();
        heavyNotebook.checkPrice();
        oldNotebook.checkPrice();
        notebook.checkWeight();
        heavyNotebook.checkWeight();
        oldNotebook.checkWeight();
        notebook.summary();
        heavyNotebook.summary();
        oldNotebook.summary();
    }
}
