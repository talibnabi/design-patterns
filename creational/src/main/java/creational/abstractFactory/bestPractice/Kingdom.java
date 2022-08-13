package creational.abstractFactory.bestPractice;

public class Kingdom {
    private Army army;
    private Castle castle;
    private King king;

    public static class FactoryMaker {
        public enum KingdomType {
            SAFAVI,
            OSMANLI;
        }

        public static KingdomFactory makeFactory(KingdomType kingdomType) {
            return switch (kingdomType) {
                case SAFAVI -> new SafaviKingdomFactory();
                case OSMANLI -> new OsmanliKingdomFactory();
            };
        }
    }
}
