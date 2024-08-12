public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
import java.util.ArrayList;
import java.util.ListIterator;

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for ArrayList
        ArrayList<Person> a = new ArrayList<>(); // Use Person instead of Integer

        // Load Person class objects in it
        a.add(new Person("fayaz", 21));
        a.add(new Person("sai", 21));
        a.add(new Person("karthik", 21));

        // Iterate it by using ListIterator
        ListIterator<Person> iterator = a.listIterator();
        while (iterator.hasNext()) {
            // Print the values using while loop
            System.out.println(iterator.next());
        }
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
