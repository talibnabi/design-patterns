package creational.abstractFactory.bestPractice;

public class OsmanliKing extends King {
    private final String kingName;
    private final String kingAge;

    public OsmanliKing(String kingName, String kingAge) {
        this.kingName = kingName;
        this.kingAge = kingAge;
    }

    @Override
    public String getKingName() {
        return this.kingName;
    }

    @Override
    public String getKingAge() {
        return this.kingAge;
    }
}
