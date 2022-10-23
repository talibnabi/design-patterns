package top50JavaInterQuestion;

public class RemoveAllOccurrences {
    /*25.Remove all occurrences of a given character from input String?*/
    public static void main(String[] args) {
        String str1 = "abcdABCDabcdABCD";
        System.out.println(removeOccurrences(str1));
    }

    private static String removeOccurrences(String str1) {
        return str1.replace("a", "");
    }
}
