package creational.abstractFactory.bestPractice;

public abstract class King {
    public abstract String getKingName();

    public abstract Integer getKingAge();

    @Override
    public String toString() {
        return "King Name: " + this.getKingName() + "/King Age: " + this.getKingAge();
    }
}
