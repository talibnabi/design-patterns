package creational.abstractFactory.bestPractice;

public abstract class Army {
    public abstract String getArmyName();

    public abstract String getArmyAge();

    public abstract Integer getArmyPowerLevel();

    @Override
    public String toString() {
        return "Army name: " + this.getArmyName() + "/Army age: " + this.getArmyAge() + "/Army power level: " + this.getArmyPowerLevel();
    }
}
