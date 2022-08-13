package creational.abstractFactory.bestPractice;

public class SafaviArmy extends Army {
    private final String armyName;
    private final String armyAge;
    private final String armyPowerLevel;

    public SafaviArmy(String armyName, String armyAge, String armyPowerLevel) {
        this.armyName = armyName;
        this.armyAge = armyAge;
        this.armyPowerLevel = armyPowerLevel;
    }

    @Override
    public String getArmyName() {
        return this.armyName;
    }

    @Override
    public String getArmyAge() {
        return this.armyAge;
    }

    @Override
    public String getArmyPowerLevel() {
        return this.armyPowerLevel;
    }
}
