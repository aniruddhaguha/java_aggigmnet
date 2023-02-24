public class AEEncryption {
    public static void main(String[] args) {

        String input = "Apple";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + 4) % 26 + 'A');
            }
            output += c;
        }

        System.out.println("Output: " + output);
    }
}

