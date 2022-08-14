package creational.prototype.bestPractice;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class Beast implements Prototype {

    public Beast() {
    }

    public Beast(Beast beast) {

    }

    @Override
    public abstract Beast copy();

}
