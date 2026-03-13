public class PangramCheck {

    public static boolean checkIfPangram(String sentence) {

        int[] frq = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            frq[c - 'a']++;
        }

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPangram(sentence);

        if (result) {
            System.out.println("The sentence is a Pangram.");
        } else {
            System.out.println("The sentence is NOT a Pangram.");
        }
    }
}