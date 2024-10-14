package School;

public class Main {

    public static void main(String[] args) {

        StudentName obj = new StudentName("Jane Okeafor");

        System.out.println(obj.getName());

        StudentName studentName = new StudentName();

        studentName.setName("Mike Tunde");

        System.out.println(studentName.getName());
    }
}
