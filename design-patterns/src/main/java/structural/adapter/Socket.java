package structural.adapter;

public class Socket {
    public static Volt getVolt() {
        return new Volt(120);
    }
}
