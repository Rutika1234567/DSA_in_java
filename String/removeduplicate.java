class removeduplicate {

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();

            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // pop
            } else {
                sb.append(c); // push
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";

        String result = removeDuplicates(input);

        System.out.println("Result: " + result);
    }
}