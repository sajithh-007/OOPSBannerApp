import java.util.HashMap;

public class PrintOops{

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        map.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return map;
    }
    

    public static void displayBanner(String message, HashMap<Character, String[]> map) {

        message = message.toUpperCase();

        int height = map.get('O').length;

        for (int line = 0; line < height; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = map.getOrDefault(ch, map.get(' '));
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}