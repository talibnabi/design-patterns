package top50JavaInterQuestion;

public interface InterfaceCheck {
    /*38. Write an interface with default and static method?*/
    void getMessage(String message);

    static boolean checkingProcess(String input) {
        System.out.println("Interface null checking..");
        return input == null ? true : "".equals(input) ? true : false;
    }

    default void log(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Boolean b = InterfaceCheck.checkingProcess("sd");
        System.out.println(b);
    }
}
