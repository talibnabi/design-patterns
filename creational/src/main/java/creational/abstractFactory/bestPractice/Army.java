package creational.abstractFactory.bestPractice;

public abstract class Army {
    public abstract String getArmyName();

    public abstract String getArmyAge();

    public abstract String getArmyPowerLevel();

    @Override
    public String toString() {
        return this.getArmyName() + this.getArmyAge() + this.getArmyPowerLevel();
    }
}
