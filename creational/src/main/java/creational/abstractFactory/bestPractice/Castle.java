package creational.abstractFactory.bestPractice;

public abstract class Castle {
    public abstract String getCastleName();

    public abstract String getCastleLocation();

    public abstract Integer getCastleAge();

    @Override
    public String toString() {
        return "Castle Name: " + this.getCastleName() + "/Castle Location: " + this.getCastleLocation() + "/Castle Age: " + this.getCastleAge();
    }
}
