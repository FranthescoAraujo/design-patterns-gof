package patterns.Strategy.pattern;

public class LoggerContext {
    
    private Storage storage;

    public LoggerContext(Storage storage) {
        this.storage = storage;
    }

    public void setLog(String type, String message) {
        storage.persist(type, message);
    }

}
