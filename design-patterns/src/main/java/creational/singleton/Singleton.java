package creational.singleton;

public class Singleton {
    private static Singleton INSTANCE;
    private String info = "Initial value";

    private Singleton() {

    }

    //Konfiqurasiya,Database ile bagli olan seyler ucun istifade olunur,normalda thread safe deyil
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getInfo());
    }
}
