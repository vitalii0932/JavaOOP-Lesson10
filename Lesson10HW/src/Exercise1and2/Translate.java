package Exercise1and2;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translate {
    File inFile;
    Map<String, String> dictionary;

    public Translate(File inFile, Map<String, String> dictionary) {
        this.inFile = inFile;
        this.dictionary = dictionary;
    }

    public Translate() {
    }

    public void setFile(File inFile) {
        this.inFile = inFile;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void dictionaryAdd(String key, String value) {
        this.dictionary.put(key, value);
    }

    public void downloadDictionary(File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            Set<String> setKeys = dictionary.keySet();

            for (String key : setKeys) {
                bw.write(key + " -> " + dictionary.get(key));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getTranslation() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Ukrainian.out"));

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    String temp = "";
                    String symbol = "";
                    if(Character.isLetterOrDigit(words[i].charAt(words[i].length() - 1))) {
                        temp = words[i];
                    } else {
                        symbol = String.valueOf(words[i].charAt(words[i].length() - 1));
                        System.out.println(symbol);
                        temp = words[i].replaceAll(symbol, "");
                    }
                    temp = temp.toLowerCase();
                    if(dictionary.get(temp) != null) {
                        temp = dictionary.get(temp);
                    }
                    if(Character.isUpperCase(words[i].charAt(0))) {
                        temp = String.valueOf(Character.toUpperCase(temp.charAt(0))) + temp.substring(1, temp.length());
                    }
                    temp += symbol + " ";
                    System.out.println(temp);
                    bw.write(temp);
                }
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "Translate{" + "file=" + inFile + ", dictionary=" + dictionary + '}';
    }
}
