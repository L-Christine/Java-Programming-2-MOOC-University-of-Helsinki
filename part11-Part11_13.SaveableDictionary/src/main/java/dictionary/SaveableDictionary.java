
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {
    private HashMap<String, String> words;
    private String file;

    public SaveableDictionary() {
        this.words = new HashMap<>();
    }

    public SaveableDictionary(String File) {
        this();
        this.file = File;
    }
    
    public boolean load() {
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(":"))
                    .forEach(parts -> {
                        words.put(parts[0], parts[1]);
                        words.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    private void saveWords(PrintWriter writer) throws IOException {
        List<String> savedList = new ArrayList<>();
        words.keySet().stream()
                .forEach(word -> {
                    if (savedList.contains(word)) {
                        return;
                    }
                    String saveForm = word + ":" + words.get(word);
                    writer.println(saveForm); //writes string to the file
                    savedList.add(word);
                    savedList.add(words.get(word));
                });
    }
    
    public void add(String word, String translation) {
        if (words.containsKey(word)) {
            return;
        }
        words.put(word, translation);
        words.put(translation, word);
    }
    
    public String translate(String word) {
        return words.get(word);
    }
    
    public void delete(String word) {
        String translation = translate(word);
        words.remove(word);
        words.remove(translation);
    }
}
