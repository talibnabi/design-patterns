package creational.prototype.bestPractice;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfBeast extends Beast {
    private final String helpType;

    public ElfBeast(ElfBeast elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public Beast copy() {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "ElfBeast{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
