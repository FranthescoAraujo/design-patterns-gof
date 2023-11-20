package patterns.Strategy.client;

import patterns.Strategy.Constants;
import patterns.Strategy.pattern.DatabaseStorage;
import patterns.Strategy.pattern.LocalStorage;
import patterns.Strategy.pattern.LoggerContext;
import patterns.Strategy.pattern.Storage;

public class Main {

    public static void main(String[] args) {
        
        Storage dbStorage = new DatabaseStorage();
        Storage localStorage = new LocalStorage("C:\\Program Files");

        LoggerContext loggerContext = new LoggerContext(dbStorage);
        loggerContext.setLog(Constants.ANSI_RED, "teste log");

        loggerContext = new LoggerContext(localStorage);
        loggerContext.setLog(Constants.ANSI_BLUE, "teste log");

        loggerContext = new LoggerContext(localStorage);
        loggerContext.setLog("", "teste log");

    }

}
