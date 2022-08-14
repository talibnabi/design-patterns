package creational.prototype.bestPractice;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
public abstract class Beast implements Prototype {

    public Beast(Beast beast) {

    }

    @Override
    public abstract Beast copy();

}
