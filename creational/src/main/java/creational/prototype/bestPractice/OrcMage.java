package creational.prototype.bestPractice;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcMage extends Mage {
    private final String weapon;

    public OrcMage(OrcMage orcMage) {
        super(orcMage);
        this.weapon = orcMage.weapon;
    }

    @Override
    public Mage copy() {
        return new OrcMage(this);
    }

    @Override
    public String toString() {
        return "OrcMage{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
