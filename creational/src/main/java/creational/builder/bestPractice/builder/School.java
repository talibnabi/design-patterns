package creational.builder.bestPractice.builder;

import creational.builder.bestPractice.enums.SchoolLocation;
import creational.builder.bestPractice.enums.SchoolName;

public final class School {
    private final SchoolName schoolName;
    private final Integer schoolNumber;
    private final Integer schoolAge;
    private final SchoolLocation schoolLocation;

    public School(SchoolBuilder schoolBuilder) {
        this.schoolName = schoolBuilder.schoolName;
        this.schoolNumber = schoolBuilder.schoolNumber;
        this.schoolAge = schoolBuilder.schoolAge;
        this.schoolLocation = schoolBuilder.schoolLocation;
    }

    public Integer getSchoolAge() {
        return schoolAge;
    }

    public SchoolName getSchoolName() {
        return schoolName;
    }

    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    public SchoolLocation getSchoolLocation() {
        return schoolLocation;
    }


    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", schoolAge=" + schoolAge +
                ", schoolLocation='" + schoolLocation + '\'' +
                '}';
    }

    public static final class SchoolBuilder {
        private final SchoolName schoolName;
        private final Integer schoolNumber;
        private Integer schoolAge;
        private SchoolLocation schoolLocation;

        public SchoolBuilder(SchoolName schoolName, Integer schoolNumber) throws IllegalAccessException {
            if (schoolName == null) {
                throw new IllegalAccessException("School name not found.");
            }
            this.schoolName = schoolName;
            this.schoolNumber = schoolNumber;
        }


        public SchoolBuilder setSchoolAge(Integer schoolAge) {
            this.schoolAge = schoolAge;
            return this;
        }

        public SchoolBuilder setSchoolLocation(SchoolLocation schoolLocation) {
            this.schoolLocation = schoolLocation;
            return this;
        }

        public School build() {
            return new School(this);
        }
    }
}
