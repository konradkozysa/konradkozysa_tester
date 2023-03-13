public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        int tableSize;
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[size] = value;
        this.size++;
    }

    public void lastValue () {
        System.out.println(grades[this.size-1]);
    }

    public void avrValue() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + grades[i];
        }
        System.out.println((double)sum/size);
    }

    public void allValue () {
        for (int i = 0; i < this.size; i++) {
            System.out.println(grades[i]);
        }
    }

}
