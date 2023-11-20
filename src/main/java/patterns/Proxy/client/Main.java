package patterns.Proxy.client;

import patterns.Proxy.pattern.Proxy;

public class Main {
    
    public static void main(String[] args) {
        Proxy proxy = new Proxy("Name 01", "Age 01");
        System.out.println(proxy);
    }

}
