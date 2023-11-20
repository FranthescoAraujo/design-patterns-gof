package patterns.Composite.client;

import patterns.Composite.pattern.CSharpCategory;
import patterns.Composite.pattern.JavaCategory;
import patterns.Composite.pattern.PHPCategory;
import patterns.Composite.pattern.PythonCategory;

public class Main {
    
    public static void main(String[] args) {
        
        JavaCategory javaCategory = new JavaCategory();
        PHPCategory phpCategory = new PHPCategory();
        CSharpCategory cSharpCategory = new CSharpCategory();
        PythonCategory pythonCategory = new PythonCategory();

        cSharpCategory.addCategory(pythonCategory);
        javaCategory.addCategory(phpCategory);
        javaCategory.addCategory(cSharpCategory);

        javaCategory.ls();

    }

}
