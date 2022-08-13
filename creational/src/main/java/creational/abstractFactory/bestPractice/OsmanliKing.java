package creational.abstractFactory.bestPractice;

public class OsmanliKing extends King {
    private final String kingName;
    private final Integer kingAge;

    public OsmanliKing(String kingName, Integer kingAge) {
        this.kingName = kingName;
        this.kingAge = kingAge;
    }

    @Override
    public String getKingName() {
        return this.kingName;
    }

    @Override
    public Integer getKingAge() {
        return this.kingAge;
    }
}
