package creational.abstractFactory.bestPractice;

public class SafaviCastle extends Castle {
    private final String castleName;
    private final String castleLocation;
    private final String castleAge;

    public SafaviCastle(String castleName, String castleLocation, String castleAge) {
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
    public String getCastleAge() {
        return this.castleAge;
    }
}
