package creational.builder.bestPractice;

public final class School {
    private final String schoolName;
    private final Integer schoolNumber;
    private final Integer schoolAge;
    private final String schoolLocation;

    public School(SchoolBuilder schoolBuilder) {
        this.schoolName = schoolBuilder.schoolName;
        this.schoolNumber = schoolBuilder.schoolNumber;
        this.schoolAge = schoolBuilder.schoolAge;
        this.schoolLocation = schoolBuilder.schoolLocation;
    }

    public Integer getSchoolAge() {
        return schoolAge;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Integer getSchoolNumber() {
        return schoolNumber;
    }

    public String getSchoolLocation() {
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
        private String schoolName;
        private Integer schoolNumber;
        private Integer schoolAge;
        private String schoolLocation;

        public SchoolBuilder setSchoolName(String schoolName) {
            this.schoolName = schoolName;
            return this;
        }

        public SchoolBuilder setSchoolNumber(Integer schoolNumber) {
            this.schoolNumber = schoolNumber;
            return this;
        }

        public SchoolBuilder setSchoolAge(Integer schoolAge) {
            this.schoolAge = schoolAge;
            return this;
        }

        public SchoolBuilder setSchoolLocation(String schoolLocation) {
            this.schoolLocation = schoolLocation;
            return this;
        }

        public School build() {
            return new School(this);
        }
    }
}
