package patterns.Proxy.pattern;

public class Person implements PersonInterface {

    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }
    
}
