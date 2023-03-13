public class GradesApp {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(3);
        grades.lastValue();
        grades.avrValue();
        grades.allValue();
    }
}
