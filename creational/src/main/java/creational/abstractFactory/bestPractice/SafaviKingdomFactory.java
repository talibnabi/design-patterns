package creational.abstractFactory.bestPractice;

import java.util.Scanner;

public class SafaviKingdomFactory implements KingdomFactory {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public King createKing() {
        return new SafaviKing(" King name: " + scanner.nextLine(), " King age: " + scanner.nextLine());
    }

    @Override
    public Castle createCastle() {
        return new SafaviCastle(" Castle name: " + scanner.nextLine(), " Castle location: " + scanner.nextLine(), " Castle age: " + scanner.nextLine());
    }

    @Override
    public Army createArmy() {
        return new SafaviArmy(" Army name: " + scanner.nextLine(), " Army age: " + scanner.nextLine(), " Army power level: " + scanner.nextLine());
    }
}
