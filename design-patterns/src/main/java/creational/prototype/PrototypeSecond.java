package creational.prototype;

public class PrototypeSecond implements Copyable<PrototypeSecond> {
    private String field1;
    private String field2;

    public PrototypeSecond(String field1, String field2) {
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
    public PrototypeSecond copy() {
        //deep copy
        return new PrototypeSecond(field1, field2);
    }

//    @Override
//    public PrototypeSecond copy() {
//        //shallow copy
//        return this;
//    }

    public static void main(String[] args) {
        PrototypeSecond prototype = new PrototypeSecond("a1", "a2");
        System.out.println(prototype.field1);
        System.out.println(prototype.field2);
        PrototypeSecond prototype1 = prototype.copy();
        prototype1.setField1("a11");
        prototype1.setField2("a22");
        System.out.println(prototype1.field1);
        System.out.println(prototype1.field2);

        System.out.println(prototype.field1);
        System.out.println(prototype.field2);
    }
}
