public class Main {
    public static void main(String[] args) {
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"}, grades = {"B", "D", "B", "A"};
        String key = "Charlie";
        boolean found = false;
        for (int i = 0; i < students.length && !found; i++){
            if (students[i].equals(key)) {
                found = true;
                System.out.println(grades[i]);
                break;
            }
        }
        System.out.println(found);
    }
}