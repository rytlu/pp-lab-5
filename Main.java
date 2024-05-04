import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
public class Main {
    public static void main(String[] args) {
        
        try {
            Person person = new Person("Wojtek", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Message");
    }
}