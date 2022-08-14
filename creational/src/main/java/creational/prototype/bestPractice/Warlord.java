package creational.prototype.bestPractice;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
public abstract class Warlord implements Prototype {
    public Warlord(Warlord warlord) {

    }

    @Override
    public abstract Warlord copy();
}
