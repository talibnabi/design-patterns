package creational.abstractFactory.bestPractice;

public class SafaviArmy extends Army {
    private final String armyName;
    private final Integer armyAge;
    private final Integer armyPowerLevel;

    public SafaviArmy(String armyName, Integer armyAge, Integer armyPowerLevel) {
        this.armyName = armyName;
        this.armyAge = armyAge;
        this.armyPowerLevel = armyPowerLevel;
    }

    @Override
    public String getArmyName() {
        return this.armyName;
    }

    @Override
    public Integer getArmyAge() {
        return this.armyAge;
    }

    @Override
    public Integer getArmyPowerLevel() {
        return this.armyPowerLevel;
    }
}
