package creational.prototype.bestPractice;

public class ElfWarlord extends Warlord {
    private final String helpType;

    public ElfWarlord(ElfWarlord elfWarlord) {
        super(elfWarlord);
        this.helpType = elfWarlord.helpType;
    }

    @Override
    public Warlord copy() {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "ElfWarlord{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
