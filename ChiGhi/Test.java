package ChiGhi;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName() + " " + student1.getLop());

        Student student2 = new Student("Nghi","Gioi nhat truong");
        student2.display();
    }
}
