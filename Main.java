public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"hoang");
        Student s2 = new Student(111,"hoang");
        Student s3 = new Student(111,"hoang");

        s1.display();
        s2.display();
        s3.display();
    }
}
