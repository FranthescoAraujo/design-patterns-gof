package patterns.Flyweight.pattern;

public class Soldier {
    
    private String name;
    private Integer age;

    public Soldier(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Hash: " + hashCode();
    }

}
