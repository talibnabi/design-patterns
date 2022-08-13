package creational.abstractFactory.bestPractice;

public class SafaviKing extends King {
    private final String kingName;
    private final String kingAge;

    public SafaviKing(String kingName, String kingAge) {
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
