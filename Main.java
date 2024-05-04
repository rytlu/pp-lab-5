import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        
        try {
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

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Suma " + num1 + " i " + num2 + " to: " + sum);
    }
}
