package patterns.FactoryMethod.pattern;

public class Triangle implements ProductInterface {

    private String directory = "/root/";

    @Override
    public String getImage() {
        return directory + "/triangle.png";
    }

    @Override
    public void setDirectory(String directory) {
        this.directory += directory;
    }
    
}
