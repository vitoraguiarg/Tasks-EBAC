// Concrete class
class LegalPerson extends Person {
    String cnpj;

    LegalPerson(String name, int age, String cnpj) {
        super(name, age);
        this.cnpj = cnpj;
    }

    @Override
    public void speak() {
        System.out.println("Greetings, I'm " + name + " and I'm " + age + " years old.");
    }
}