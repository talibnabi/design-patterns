package creational.prototype;

public class Prototype implements Cloneable {
    // clone pattern  : // sinifin instansin yaratmaq eziyyetlidi,mailiyyetlidi
    // , instansin davamli davamli yaratmiriq ona gore.
    // yeni nelerse yaratmirsan,evvel yaratdiginin kopyasin goturursen
    private String field1;
    private String field2;

    public Prototype(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public Prototype clone() {
        //deep copy
        return new Prototype(field1, field2);
    }
//    @Override
//    public Prototype clone() {
//        //shallow copy
//        Prototype prototype = this;
//        return prototype;
//    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype("a1", "a2");
        System.out.println(prototype.field1);
        System.out.println(prototype.field2);
        Prototype prototype1 = prototype.clone();
        prototype1.setField1("a11");
        prototype1.setField2("a22");
        System.out.println(prototype1.field1);
        System.out.println(prototype1.field2);

        System.out.println(prototype.field1);
        System.out.println(prototype.field2);
    }
}
