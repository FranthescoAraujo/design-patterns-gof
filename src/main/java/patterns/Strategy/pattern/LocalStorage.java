package patterns.Strategy.pattern;

import patterns.Strategy.Constants;

public class LocalStorage implements Storage {

    private String dir;

    public LocalStorage(String dir) {
        this.dir = dir;
    }

    @Override
    public boolean persist(String type, String... array) {
        System.out.println(type + "Salvar no diretório " + dir + Constants.ANSI_RESET);
        return true;
    }
    
}
