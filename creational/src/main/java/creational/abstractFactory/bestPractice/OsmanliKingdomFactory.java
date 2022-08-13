package creational.abstractFactory.bestPractice;

import java.util.Scanner;

public class OsmanliKingdomFactory implements KingdomFactory {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public King createKing() {
        return new OsmanliKing("King name: " + scanner.nextLine(), " King age: " + scanner.nextLine());
    }

    @Override
    public Castle createCastle() {
        return new OsmanliCastle("Castle name: " + scanner.nextLine(), " Castle location: " + scanner.nextLine(), " Castle age: " + scanner.nextLine());
    }

    @Override
    public Army createArmy() {
        return new OsmanliArmy(" Army name: " + scanner.nextLine(), " Army age: " + scanner.nextLine(), " Army power level: " + scanner.nextLine());
    }
}
