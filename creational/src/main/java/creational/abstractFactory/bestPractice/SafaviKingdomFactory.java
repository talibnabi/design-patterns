package creational.abstractFactory.bestPractice;

import java.util.Scanner;

public class SafaviKingdomFactory implements KingdomFactory {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public King createKing() {
        return null;
    }

    @Override
    public Castle createCastle() {
        return null;
    }

    @Override
    public Army createArmy() {
        return null;
    }
}
