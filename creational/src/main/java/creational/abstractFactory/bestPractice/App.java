package creational.abstractFactory.bestPractice;

public class App {
    public static void main(String[] args) {
        KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(Kingdom.FactoryMaker.KingdomType.SAFAVI);
        Army army = kingdomFactory.createArmy();
        Castle castle = kingdomFactory.createCastle();
        King king = kingdomFactory.createKing();
        System.out.println(army.toString());
        System.out.println(castle.toString());
        System.out.println(king.toString());
    }
}
