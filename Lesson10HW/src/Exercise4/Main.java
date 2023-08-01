package Exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, String[]> characterStringMap = createMap();
        Scanner sc = new Scanner(System.in);
        System.out.println("input text: ");
        String str = sc.nextLine();
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        String[] asciiArt = new String[5];
        for (int i = 0; i < chars.length; i++) {
            String[] temp = characterStringMap.get(chars[i]);
            if(temp != null) {
                for (int j = 0; j < temp.length; j++) {
                    if(i == 0) {
                        asciiArt[j] = temp[j] + "   ";
                    } else {
                        asciiArt[j] += temp[j] + "   ";
                    }
                }
            }
            else {
                System.out.println("Error. Use english language.");
            }
        }

        for (String line : asciiArt) {
            if(line!= null)
            System.out.println(line);
        }
    }

    private static Map<Character, String[]> createMap() {
        Map<Character, String[]> asciiArtMap = new HashMap<>();
        asciiArtMap.put('A', new String[]{
                "  /\\  ",
                " /  \\ ",
                "/----\\",
                "/    /",
                "/    /"
        });
        asciiArtMap.put('B', new String[]{
                "||== ",
                "||   ",
                "||== ",
                "||   ",
                "||== "
        });
        asciiArtMap.put('C', new String[]{
                "  ___ ",
                " /    ",
                "/     ",
                "\\     ",
                " \\___ "
        });
        asciiArtMap.put('D', new String[]{
                "||== ",
                "||  \\",
                "||   \\",
                "||  /",
                "||== "
        });
        asciiArtMap.put('E', new String[]{
                "|||||",
                "||   ",
                "|||||",
                "||   ",
                "|||||"
        });
        asciiArtMap.put('F', new String[]{
                "|||||",
                "||   ",
                "||-- ",
                "||   ",
                "||   "
        });
        asciiArtMap.put('G', new String[]{
                " ___ ",
                "/    ",
                "| ===",
                "\\   \\",
                " \\__|"
        });
        asciiArtMap.put('H', new String[]{
                "||  ||",
                "||  ||",
                "||||||",
                "||  ||",
                "||  ||"
        });
        asciiArtMap.put('I', new String[]{
                "|||||",
                " ||  ",
                " ||  ",
                " ||  ",
                "|||||"
        });
        asciiArtMap.put('J', new String[]{
                "|||||",
                "  || ",
                "  || ",
                "  || ",
                "_||_ "
        });
        asciiArtMap.put('K', new String[]{
                "||  /",
                "|| / ",
                "||<  ",
                "|| \\ ",
                "||  \\"
        });
        asciiArtMap.put('L', new String[]{
                "||   ",
                "||   ",
                "||   ",
                "||   ",
                "|||||"
        });
        asciiArtMap.put('M', new String[]{
                "||\\  ||",
                "||\\\\ ||",
                "|| \\\\||",
                "||  \\||",
                "||   ||"
        });
        asciiArtMap.put('N', new String[]{
                "||\\  ||",
                "||\\\\ ||",
                "|| \\\\||",
                "||  \\||",
                "||   ||"
        });
        asciiArtMap.put('O', new String[]{
                " ____ ",
                "/    \\",
                "||  ||",
                "\\    /",
                " ---- "
        });
        asciiArtMap.put('P', new String[]{
                "|||||",
                "||  ||",
                "|||||",
                "||   ",
                "||   "
        });
        asciiArtMap.put('Q', new String[]{
                " ---- ",
                "/    \\",
                "| -- |",
                "\\ -- |",
                " ----\\"
        });
        asciiArtMap.put('R', new String[]{
                "|||||",
                "||  ||",
                "|||||",
                "|| \\/",
                "||  \\\\"
        });
        asciiArtMap.put('S', new String[]{
                " ____",
                "/    ",
                " \\__ ",
                "    \\",
                "____/"
        });
        asciiArtMap.put('T', new String[]{
                "|||||",
                " ||  ",
                " ||  ",
                " ||  ",
                " ||  "
        });
        asciiArtMap.put('U', new String[]{
                "||  ||",
                "||  ||",
                "||  ||",
                "||  ||",
                "|____|"
        });
        asciiArtMap.put('V', new String[]{
                "||  ||",
                "||  ||",
                "||  ||",
                " \\\\// ",
                "  \\/  "
        });
        asciiArtMap.put('W', new String[]{
                "||    ||",
                "||    ||",
                "|| /\\ ||",
                "||//\\\\||",
                "||    ||"
        });
        asciiArtMap.put('X', new String[]{
                "||  ||",
                " \\\\// ",
                "  \\/  ",
                " \\\\// ",
                "||  ||"
        });
        asciiArtMap.put('Y', new String[]{
                "||  ||",
                " \\\\// ",
                "  \\/  ",
                "  ||  ",
                "  ||  "
        });
        asciiArtMap.put('Z', new String[]{
                "|||||",
                "   //",
                "  // ",
                " //  ",
                "|||||"
        });

        return asciiArtMap;
    }
}
