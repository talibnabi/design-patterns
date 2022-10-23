package top50JavaInterQuestion;

public class RemoveLeadingAndTrailingWhitespace {
    /*9.How to remove leading and trailing whitespaces from a string?*/
    public static void main(String[] args) {
        String s = "  abc  def\t  drtf - ";
        s = s.strip();
        System.out.println(s);
    }
}
