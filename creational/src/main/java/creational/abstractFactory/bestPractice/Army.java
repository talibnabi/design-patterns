package creational.abstractFactory.bestPractice;

public abstract class Army {
    public abstract String getArmyName();

    public abstract Integer getArmyAge();

    public abstract Integer getArmyPowerLevel();

    @Override
    public String toString() {
        return "Army Name: " + this.getArmyName() + "/Army Age: " + this.getArmyAge() + "/Army Power Level: " + this.getArmyPowerLevel();
    }
}
