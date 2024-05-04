import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Jan Kowalski", 25);
            people[2] = new Person("Janina Kowalska", 40);
            people[3] = new Person("Wojtek Kowalski", 35);
            people[4] = new Person("Wieslaw Kowalski", 20);

            Person person = new Person("Wojtek", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException error) {
            System.out.println("Error: " + error.getMessage());
        }
        int num1 = 3;
        int num2 = 6;

        int sum = MathUtils.add(num1, num2);
        System.out.println("wynik = " + sum);

        
        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                
                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage("Value for " + person.getName() + " is: " + value);
            }
        }
    }
}