package creational.factory.simpleFirst;

public abstract class Computer {
    public abstract String getRAM();

    public abstract String getCPU();

    public abstract String getHDD();

    @Override
    public String toString() {
        return "RAM: " + this.getRAM() + ",CPU: " + this.getCPU() + ",HDD: " + this.getHDD();
    }
}
