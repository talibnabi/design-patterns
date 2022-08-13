package creational.factory.simpleFirst;

public class Server extends Computer {
    private final String ram;
    private final String cpu;
    private final String hdd;

    public Server(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getHDD() {
        return hdd;
    }
}
