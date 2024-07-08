package tempgen.templates;

import tempgen.templates.generators.Generator;

public class TemplateFormat {
    private Template template;
    private String divider;

    public TemplateFormat(Template template, String divider) {
        this.template = template;
        this.divider = divider;
    }

    public Generator generator() {
        return new Generator(this);
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String getDivider() {
        return divider;
    }

    public void setDivider(String divider) {
        this.divider = divider;
    }
}
