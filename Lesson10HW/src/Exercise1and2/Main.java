package Exercise1and2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        File fileIn = new File("C:\\Users\\User\\IdeaProjects\\Lesson10HW\\src\\English.in");
        File downloadDictionaryFile = new File("dictionary.txt");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "привіт");
        dictionary.put("world", "світ");
        dictionary.put("this", "це");
        dictionary.put("is", "є");
        dictionary.put("java", "java");
        dictionary.put("lesson", "урок");
        Translate translate = new Translate(fileIn, dictionary);
        translate.getTranslation();
        dictionary.put("apple", "яблуко");
        translate.downloadDictionary(downloadDictionaryFile);
    }
}