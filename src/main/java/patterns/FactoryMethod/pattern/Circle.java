package patterns.FactoryMethod.pattern;

public class Circle implements ProductInterface {

    private String directory = "/root/";

    @Override
    public String getImage() {
        return directory + "/circle.png";
    }

    @Override
    public void setDirectory(String directory) {
        this.directory += directory;
    }
    
}
