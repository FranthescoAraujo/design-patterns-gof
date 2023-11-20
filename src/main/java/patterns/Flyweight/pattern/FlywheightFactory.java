package patterns.Flyweight.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlywheightFactory {
    
    List<Soldier> soldierList = new ArrayList<>();

    public Soldier getSoldier(int key) {
        if (soldierList.size() <= key) {
            soldierList.add(makeSoldier());
        }
        return soldierList.get(key);
    }

    private Soldier makeSoldier() {
        String[] names = new String[] {
            "Livius Aleksander",
            "Mason Hugubert",
            "Pat Longinus",
            "Tiborc Nikhil",
            "Quirino Anand"
        };

        String name = getRandomName(names);

        Integer[] ages = new Integer[] {
            19,
            21,
            27,
            32,
            38
        };

        Integer age = getRandomAge(ages);

        return new Soldier(name, age);
    }

    private String getRandomName(String[] names) {
        int rnd = new Random().nextInt(names.length);
        return names[rnd];
    }

    private Integer getRandomAge(Integer[] ages) {
        int rnd = new Random().nextInt(ages.length);
        return ages[rnd];
    }

}
