package creational.abstractFactory.bestPractice;

public abstract class King {
    public abstract String getKingName();

    public abstract String getKingAge();

    @Override
    public String toString() {
        return this.getKingName() + this.getKingAge();
    }

}
