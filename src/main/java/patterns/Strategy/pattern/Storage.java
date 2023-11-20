package patterns.Strategy.pattern;

public interface Storage {
    
    public boolean persist(String type, String... array);

}
