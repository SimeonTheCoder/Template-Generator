package tempgen.templates;

import java.util.ArrayList;
import java.util.List;

public class Template {
    private List<Category> categories;

    public Template() {
        this.categories = new ArrayList<>();
    }

    public Template(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public tempgen.templates.TemplateFormat divider(String divider) {
        return new tempgen.templates.TemplateFormat(this, divider);
    }

    public Template add(String name, String... options) {
        this.categories.add(new tempgen.templates.Category(name, options));
        return this;
    }
}
