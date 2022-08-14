package creational.prototype.bestPractice;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcWarlord extends Warlord {
    private final String weapon;

    public OrcWarlord(OrcWarlord orcWarlord) {
        super(orcWarlord);
        this.weapon = orcWarlord.weapon;
    }

    @Override
    public Warlord copy() {
        return new OrcWarlord(this);
    }

    @Override
    public String toString() {
        return "OrcWarlord{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
