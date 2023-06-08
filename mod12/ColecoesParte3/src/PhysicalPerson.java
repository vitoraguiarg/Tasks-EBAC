// Concrete class
class PhysicalPerson extends Person {
    String cpf;

    PhysicalPerson(String name, int age, String cpf) {
        super(name, age);
        this.cpf = cpf;
    }

    @Override
    public void speak() {
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");
    }
}