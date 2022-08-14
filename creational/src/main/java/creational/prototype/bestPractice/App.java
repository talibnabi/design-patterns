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


        HeroFactoryImpl heroFactory2 = new HeroFactoryImpl(new ElfBeast("x"), new ElfMage("y"), new ElfWarlord("z"));
        Beast beast2 = heroFactory2.createBeast();
        Mage mage2 = heroFactory2.createMage();
        Warlord warlord2 = heroFactory2.createWarlord();
        System.out.println(beast2);
        System.out.println(warlord2);
        System.out.println(mage2);
        System.out.println(beast.hashCode() == beast2.hashCode());
    }
}
