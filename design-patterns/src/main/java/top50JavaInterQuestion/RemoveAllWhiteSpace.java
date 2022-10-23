package top50JavaInterQuestion;

public class RemoveAllWhiteSpace {
    /*8.How to remove Whitespaces from String*/
    public static void main(String[] args) {

    }

    private static String removeWhiteSpace(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!Character.isWhitespace(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
