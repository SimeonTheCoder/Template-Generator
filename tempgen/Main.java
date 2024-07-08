package tempgen;

import tempgen.templates.Template;
import tempgen.templates.TemplateParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] data = new Template()
            .add("Test", "A", "B", "C", "D")
            .add("tempgen.templates.Category", "Alpha", "Beta")
            .divider(" -> ")
            .generator()
            .generateMultiple(10)
            .getResults();

        for (String s : data) {
            System.out.println(s);
        }

        TemplateParser.parse("template.txt")
            .divider(": ")
            .generator()
            .generateMultiple(10)
            .toFiles("output_$.txt");
    }
}
