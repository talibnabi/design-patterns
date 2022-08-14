package creational.prototype.bestPractice;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory {
    private final Beast beast;
    private final Mage mage;
    private final Warlord warlord;

    @Override
    public Beast createBeast() {
        return beast.copy();
    }

    @Override
    public Mage createMage() {
        return mage.copy();
    }

    @Override
    public Warlord createWarlord() {
        return warlord.copy();
    }
}
