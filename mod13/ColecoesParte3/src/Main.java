// Usage
public class Main {
    public static void main(String[] args) {
        PhysicalPerson p1 = new PhysicalPerson("John", 30, "123.456.789-00");
        LegalPerson p2 = new LegalPerson("ABC Company", 5, "12.345.678/0001-90");

        p1.speak(); // Outputs "Hello, I'm John and I'm 30 years old."
        p2.speak(); // Outputs "Greetings, I'm ABC Company and I'm 5 years old."
    }
}