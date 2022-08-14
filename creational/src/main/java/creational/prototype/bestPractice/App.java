package creational.prototype.bestPractice;

public class App {
    public static void main(String[] args) {
        HeroFactoryImpl heroFactory = new HeroFactoryImpl(new ElfBeast("x"), new ElfMage("y"), new ElfWarlord("z"));
        Beast beast = heroFactory.createBeast();
        Mage mage = heroFactory.createMage();
        Warlord warlord = heroFactory.createWarlord();
        System.out.println(beast);
        System.out.println(warlord);
        System.out.println(mage);
    }
}
