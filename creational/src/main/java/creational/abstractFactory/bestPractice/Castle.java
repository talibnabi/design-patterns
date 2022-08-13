package creational.abstractFactory.bestPractice;

public abstract class Castle {
    public abstract String getCastleName();

    public abstract String getCastleLocation();

    public abstract String getCastleAge();

    @Override
    public String toString() {
        return this.getCastleName() + this.getCastleLocation() + this.getCastleAge();
    }
}
