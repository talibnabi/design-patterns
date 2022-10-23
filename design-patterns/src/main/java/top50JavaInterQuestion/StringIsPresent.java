package top50JavaInterQuestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringIsPresent {
    /*21.How to find if a string is present in a text file?*/
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(findStringInFile("text.txt","habib"));
    }

    private static boolean findStringInFile(String filePath, String text) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals(text)) {
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }
}
