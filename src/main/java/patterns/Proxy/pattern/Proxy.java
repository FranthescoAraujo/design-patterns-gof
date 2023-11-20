package patterns.Proxy.pattern;

public class Proxy implements PersonInterface {
    
    private int count;
    private Person person;
    private String name;
    private String age;

    public Proxy(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        person = makePerson();
        return person.getName();
    }

    @Override
    public String getAge() {
        person = makePerson();
        return person.getName();
    }

    private Person makePerson() {
        if (person == null) {
            person = new Person(name + " - Proxy", age + " - Proxy");
            count++;
        }
        return person;
    }

    private int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + getAge() + " Count: " + getCount();
    }

}
