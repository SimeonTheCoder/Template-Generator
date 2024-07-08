package tempgen.templates.generators;

import tempgen.templates.TemplateFormat;

import java.util.Random;

public class Generator {
    private static Random random = new Random();
    private TemplateFormat templateFormat;

    public Generator(TemplateFormat templateFormat) {
        this.templateFormat = templateFormat;
    }

    public String generateLine(String heading, String[] options, String divider) {
        return heading + divider + options[random.nextInt(options.length)];
    }

    public String generate() {
        StringBuilder result = new StringBuilder();

        int lineCount = this.templateFormat.getTemplate().getCategories().size();

        for(int currLine = 0; currLine < lineCount; currLine ++) {
            if(currLine > 0) result.append(System.lineSeparator());

            String currCategory = this.templateFormat.getTemplate().getCategories().get(currLine).getName();
            String[] currOptions = this.templateFormat.getTemplate().getCategories().get(currLine).getOptions();

            String line = generateLine(currCategory, currOptions, this.templateFormat.getDivider());

            result.append(line);
        }

        return result.toString();
    }

    public Generated generateMultiple(int count) {
        String[] data = new String[count];

        for(int currPrompt = 0; currPrompt < count; currPrompt ++) {
            data[currPrompt] = generate();
        }

        return new Generated(data);
    }

    public TemplateFormat getTemplateFormat() {
        return templateFormat;
    }

    public void setTemplateFormat(TemplateFormat templateFormat) {
        this.templateFormat = templateFormat;
    }
}
