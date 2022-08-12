package creational.builder;

public class Computer {
    private final String HDD;
    private final String RAM;
    private final boolean isGraphicsCardEnabled;
    private final boolean isBlueToothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBlueToothEnabled() {
        return isBlueToothEnabled;
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBlueToothEnabled = computerBuilder.isBlueToothEnabled;
    }

    public static class ComputerBuilder {
        private final String HDD;
        private final String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBlueToothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBlueToothEnabled(boolean isBlueToothEnabled) {
            this.isBlueToothEnabled = isBlueToothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
