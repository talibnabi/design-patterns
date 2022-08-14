package creational.prototype.bestPractice;

public class ElfMage extends Mage {
    private final String helpType;

    public ElfMage(ElfMage elfMage) {
        super(elfMage);
        this.helpType = elfMage.helpType;
    }

    @Override
    public Mage copy() {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "ElfMage{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
