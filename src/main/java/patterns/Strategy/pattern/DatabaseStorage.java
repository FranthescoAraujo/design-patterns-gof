package patterns.Strategy.pattern;

import patterns.Strategy.Constants;

public class DatabaseStorage implements Storage {

    @Override
    public boolean persist(String type, String... array) {
        System.out.println(type + "Salvar no banco de dados" + Constants.ANSI_RESET);
        return true;
    }
    
}
