package patterns.Composite.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class CategoriesAbstract {
    
    private List<CategoriesAbstract> categoryList =  new ArrayList<>();

    public abstract String getName();

    public void addCategory(CategoriesAbstract category) {
        categoryList.add(category);
    }

    public void removeCategory(CategoriesAbstract category) {
        categoryList.remove(category);
    }

    public CategoriesAbstract getChild(int key) {
        return categoryList.get(key);
    }

    public void ls() {
        System.out.println("Nome: " + getName());
        System.out.println("Quantidade: " + categoryList.size());
        for (CategoriesAbstract categoriesAbstract : categoryList) {
            categoriesAbstract.ls();
        }
    }

}
