package creational.abstractFactory.bestPractice;

import java.util.Scanner;

public class OsmanliKingdomFactory implements KingdomFactory {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public King createKing() {
        return new OsmanliKing(scanner.nextLine(), scanner.nextInt());
    }

    @Override
    public Castle createCastle() {
        return new OsmanliCastle(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
    }

    @Override
    public Army createArmy() {
        return new OsmanliArmy(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
    }
}
