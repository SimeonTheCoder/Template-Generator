package tempgen.templates;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemplateParser {
    public static Template parse(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        List<Category> categories = new ArrayList<>();

        while(scanner.hasNextLine()) {
            String categoryName = scanner.nextLine();
            String[] options = scanner.nextLine().split(" ");

            categories.add(new Category(categoryName, options));

            scanner.nextLine();
        }

        return new Template(categories);
    }

    public static Template parse(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));

        List<Category> categories = new ArrayList<>();

        while(scanner.hasNextLine()) {
            String categoryName = scanner.nextLine();
            String[] options = scanner.nextLine().split(" ");

            categories.add(new Category(categoryName, options));

            scanner.nextLine();
        }

        return new Template(categories);
    }
}
