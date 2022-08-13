package creational.abstractFactory.bestPractice;

public class OsmanliCastle extends Castle {
    private final String castleName;
    private final String castleLocation;
    private final Integer castleAge;

    public OsmanliCastle(String castleName, String castleLocation, Integer castleAge) {
        this.castleName = castleName;
        this.castleLocation = castleLocation;
        this.castleAge = castleAge;
    }

    @Override
    public String getCastleName() {
        return this.castleName;
    }

    @Override
    public String getCastleLocation() {
        return this.castleLocation;
    }

    @Override
    public Integer getCastleAge() {
        return this.castleAge;
    }
}
