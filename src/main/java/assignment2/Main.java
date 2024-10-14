package assignment2;

public class Main {

    public static void main(String[] args) {

        Learning obj = new Learning("Jane");

        System.out.println(obj.getName());


        Learning learning = new Learning();

        learning.setName("John");

        System.out.println(learning.getName());
    }
}
