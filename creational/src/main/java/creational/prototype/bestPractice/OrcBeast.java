package creational.prototype.bestPractice;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcBeast extends Beast {
    private final String weapon;

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public Beast copy() {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "OrcBeast{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
