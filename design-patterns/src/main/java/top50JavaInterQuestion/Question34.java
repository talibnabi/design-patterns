package top50JavaInterQuestion;

public class Question34 {
    /*34. Show example of switch expressions and multi-label case statements*/
    public static void main(String[] args) {
        switchEx2();
    }

    private static void switchEx1() {
        int choice = 23;
        int x = switch (choice) {
            case 1, 3, 4, 5, 23:
                yield choice;
            default:
                yield -1;
        };
        System.out.println("x=" + x);
    }

    private static void switchEx2() {
        String day = "th";
        String result = switch (day) {
            case "a", "TH", "th" -> "yes";
            case "b", "rd" -> "no";
            default -> {
                if (day.isEmpty())
                    yield "Try again";
                else
                    yield "Failure";
            }
        };
        System.out.println(result);
    }
}
