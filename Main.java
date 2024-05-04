import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
public class Main {
    public static void main(String[] args) {
        
        try {
            Person person = new Person("Wojtek", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException error) {
            System.out.println("Error: " + error.getMessage());
        }
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Message");
    }
}