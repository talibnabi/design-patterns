package creational.prototype.bestPractice;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
public abstract class Mage implements Prototype {
    public Mage(Mage mage) {

    }

    @Override
    public abstract Mage copy();
}
