package tempgen.templates.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generated {
    private String[] results;

    public Generated(String[] results) {
        this.results = results;
    }

    public void toFiles(String format) throws IOException {
        for(int currResult = 0; currResult < results.length; currResult ++) {
            String filename = format.replace("$", String.valueOf(currResult));

            File file = new File(filename);

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(results[currResult]);
            fileWriter.close();
        }
    }

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }
}
