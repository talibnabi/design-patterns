package creational.abstractFactory.bestPractice;

public interface KingdomFactory {
    King createKing();

    Castle createCastle();

    Army createArmy();
}
